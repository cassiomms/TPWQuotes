<%@ page import="tpwquotes.model.User"%>
<%	
	User user = (User) session.getAttribute("user");

	if (user == null)
	{
		System.out.println("Usuario nao autenticado!");
		response.sendRedirect("index.jsp?msg=noautentication");
		return;
	}
%>

