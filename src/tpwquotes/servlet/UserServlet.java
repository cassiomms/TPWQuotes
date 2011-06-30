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
			
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			
			
			int type = -1;
			try
			{
				if (!isMultipart)
					type = Integer.parseInt(request.getParameter("type"));
				else
					type = 2;
			}
			catch (Exception e)
			{
				targetUrl = "index.jsp?msg=exception";
				response.sendRedirect(targetUrl);
				return;
			}

			Session dbsession = DB.getSessionFactory().getCurrentSession();

			switch (type)
			{
				case LOGIN: 
					String email = request.getParameter("email");
					String password	= request.getParameter("password");
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
						psession.setAttribute("user", (User)users.get(0));
						targetUrl = "user.jsp";
						DB.getSessionFactory().close();
					}
					
					break;
				case LOGOUT: 
					psession.invalidate();
					targetUrl = "index.jsp?msg=logout";
					break;
				
				case SIGNUP:
					try
					{
						FileItemFactory factory = new DiskFileItemFactory();
						ServletFileUpload upload = new ServletFileUpload(factory);
						FileItem fitem = null;

						List items = null;
						try
						{
							items = upload.parseRequest(request);
						}
						catch (FileUploadException e)
						{
							targetUrl = "index.jsp?msg=exception3";
							e.printStackTrace();
						}

						Iterator itr = items.iterator();
			
						User u = new User();
			
						while (itr.hasNext())
						{
							FileItem item = (FileItem) itr.next();

							if (item.isFormField())
							{ // form field
								if (item.getFieldName().equals("cpf"))
								{
									try
									{
										u.setId(item.getString());
									}
									catch (Exception e)
									{
										targetUrl = "index.jsp?msg=iderror";
										response.sendRedirect(targetUrl);
										return;
									}
								}
								else if (item.getFieldName().equals("name"))
								{
									try
									{
										u.setName(item.getString());
									}
									catch (Exception e)
									{
										targetUrl = "index.jsp?msg=nameerror";
										response.sendRedirect(targetUrl);
										return;
									}
								}
								else if (item.getFieldName().equals("phone"))
								{
									try
									{
										u.setPhone(item.getString());
									}
									catch (Exception e)
									{
										targetUrl = "index.jsp?msg=phoneerror";
										response.sendRedirect(targetUrl);
										return;
									}
								}
								else if (item.getFieldName().equals("email"))
								{
									try
									{
										u.setEmail(item.getString());
									}
									catch (Exception e)
									{
										targetUrl = "index.jsp?msg=emailerror";
										response.sendRedirect(targetUrl);
										return;
									}
								}
								else if (item.getFieldName().equals("password"))
								{
									try
									{
										u.setPassword(item.getString());
									}
									catch (Exception e)
									{
										targetUrl = "index.jsp?msg=passworderror";
										response.sendRedirect(targetUrl);
										return;
									}
								}
							}
							else
							{ // is a file
								fitem = item;
							}
						}
						
						dbsession.beginTransaction();
						
						u.setPhoto(filePath+"/"+u.getId()+fitem.getName().substring(fitem.getName().lastIndexOf('.')));
						
						dbsession.save(u);
						dbsession.getTransaction().commit();
						DB.getSessionFactory().close();
						
						File savedFile = new File(filePath+"/"+u.getId()+fitem.getName().substring(fitem.getName().lastIndexOf('.')));
						fitem.write(savedFile);
						
						targetUrl = "index.jsp?msg=signupsucess";
					}
					catch (Exception e)
					{
						targetUrl = "index.jsp?msg=signupfail";
						e.printStackTrace();
					}
					
					break;
				default: 
					targetUrl = "index.jsp?msg=notfound";
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

