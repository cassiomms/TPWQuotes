package tpwquotes.servlet;

import java.io.*;
import java.util.*;
import java.lang.*;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import tpwquotes.model.*;
import tpwquotes.util.*;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;

//type 7 = pegar loan
//type 8 = pagar loan

public class LoanServlet extends HttpServlet implements Default
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, java.io.IOException
	{
	   String t;					
	   Float value;
	   User u;
	   Calendar cal;
	   String targetUrl = "index.jsp?msg=bug";
	   try
	   {
			// redirecionar de forma forcada
			//PageContext pageContext = JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);

			HttpSession psession = request.getSession();
			
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			
			
			int type = -1;
			try
			{
				type = Integer.parseInt(request.getParameter("type"));
			}
			catch (Exception e)
			{
				targetUrl = "user.jsp?msg=exception";
				response.sendRedirect(targetUrl);
				return;
			}

			Session dbsession = DB.getSessionFactory().getCurrentSession();

			switch (type)
			{
				case GETLOAN: 
					u = (User) psession.getAttribute("user");
					if (u == null)
						targetUrl = "user.jsp?msg=noautentication";
					else
					{ 
						t = request.getParameter("value");					
						value = Float.parseFloat(t);
						cal = Calendar.getInstance();
						
						dbsession.beginTransaction();
						Loan l = new Loan();
						l.setValue(value);
						l.setDate(cal.getTime());
						l.setBuyer(u); //PRECISA DE UM USER BANCO (0) JA CRIADO NO SISTEMA
						User b = (User) dbsession.load(User.class,"0");
						l.setSeller(b);
						
						u.setFunds(u.getFunds() + value);
						u.setDebt(u.getDebt() + value);		
						
						dbsession.update(u);
						dbsession.save(l);
						dbsession.getTransaction().commit();
						

					}

					break;
				case PAYLOAN: 
					u = (User) psession.getAttribute("user");
					if (u == null)
						targetUrl = "user.jsp?msg=noautentication";
					else {
					
					t = request.getParameter("value");						
					value = Float.parseFloat(t);
					if (u.getFunds() < value)
								targetUrl = "user.jsp?notenoughmoney";
					else if (value > u.getDebt())
								targetUrl = "user.jsp?debtunderflow";
					     else {
					     		dbsession.beginTransaction();
							u.setDebt(u.getDebt() - value);
							u.setFunds(u.getFunds() - value);	
							dbsession.update(u);
							dbsession.getTransaction().commit();		
						  }
					}
					break;
							
				default: 
					targetUrl = "user.jsp?msg=notfound";
					break;
			}
		DB.getSessionFactory().close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			targetUrl = "user.jsp?msg=exception2";
		}
		
		response.sendRedirect(targetUrl);
		return;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, java.io.IOException
	{
		doGet(request, response);
	}
}

