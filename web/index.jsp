<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header.jsp">
	<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
	<form action="#" id="login_form" method="post">

		<input type="text" id="email" name="email" />
		<input type="password" id="pass" name="pass" />
		<input type="submit" value="Login" class="button" />

    </form>

	<a href="signup.jsp"> Cadastrar </a> <br>
</div>

<jsp:include page="footer.jsp"/>

