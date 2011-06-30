package tpwquotes.servlet;

import java.io.*;
import java.util.List;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import tpwquotes.model.*;
import tpwquotes.util.*;
import org.hibernate.*;
import org.hibernate.criterion.*;

public class UserServlet extends HttpServlet implements Default
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, java.io.IOException
	{
	   String targetUrl = "index.jsp?msg=bug";
	   try
	   {
			// redirecionar de forma forcada
			//PageContext pageContext = JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);

			HttpSession psession = request.getSession();

			int type = -1;
			try
			{
				type = Integer.parseInt(request.getParameter("type"));
			}
			catch (Exception e)
			{
				targetUrl = "index.jsp?msg=exception";
				response.sendRedirect(targetUrl);
				return;
			}

			String email = request.getParameter("email");
			String password	= request.getParameter("password");
			//String name	= request.getParameter("name");

			Session dbsession = DB.getSessionFactory().getCurrentSession();

			switch (type)
			{
				//case A:
					
					//break;
				//case B: 
					
					//break;
				case LOGIN: 
					dbsession.beginTransaction();
					List users = dbsession.createCriteria(User.class)
					.add( Restrictions.eq("email", email) )
					.add( Restrictions.eq("password", password) )
					.list();
					dbsession.getTransaction().commit();
					
					if (users.isEmpty())
					{
						targetUrl = "index.jsp?msg=invalid"; //Usuario invalido
						DB.getSessionFactory().close();
					}
					else // Achou o usuario com email e senha
					{
						//Adiciona o usuario na http session aqui
						
						targetUrl = "user.jsp";
						DB.getSessionFactory().close();
					}
					
					break;
				case LOGOUT: 
					psession.invalidate();
					targetUrl = "index.jsp?msg=logout";
					break;
				default: 
					targetUrl = "index.jsp?msg=nf";
					break;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			targetUrl = "index.jsp?msg=exception2";
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

