<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header.jsp">
	<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
	<form action="userservlet" id="login_form" method="post">
		<input type="hidden" id="type" name="type" value="0" />
		<p align="center">E-mail:     <input type="text" id="email" name="email" /></p>
		<p align="center">Password:<input type="password" id="password" name="password" /></p>
		<p align="center"><input name="login" type="image" src="static/images/submit.gif" class="button" /></p>
	</form>
</div>

<jsp:include page="footer.jsp"/>
