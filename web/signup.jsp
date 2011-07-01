<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header.jsp">
<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
  <form action="userservlet" id="signup_form" method="post" enctype="multipart/form-data">
  	<input type="hidden" id="type" name="type" value="2"/>
	<p align="center"><b>CPF: <input type="text" id="cpf" name="cpf" /></p>
	<p align="center"><b>Name: <input type="text" id="name" name="name" /></p>
	<p align="center"><b>Email: <input type="text" id="email" name="email" /></p>
	<p align="center"><b>Password: <input type="password" id="password" name="password" /></p>
	<p align="center"><b>Photo: <input type="file" id="photo" name="photo" /></p>
	<p align="center"><b>Phone: <input type="text" id="phone" name="phone" /></p>
	<p align="center"><input type="image" src="images/submit.gif" class="button" /></p>
   </form>
</div>

<jsp:include page="footer.jsp"/>
