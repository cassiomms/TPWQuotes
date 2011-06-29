<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header.jsp">
	<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
	<form action="#" id="signup_form" method="post" enctype="multipart/form-data">

		<input type="text" id="cpf" name="cpf" />
		<input type="text" id="name" name="name" />
		<input type="text" id="email" name="email" />
		<input type="password" id="pass" name="pass" />
		<input type="file" id="photo" name="photo" />
		<input type="text" id="phone" name="phone" />
		<input type="submit" value="Signup" class="button" />

    </form>
</div>

<jsp:include page="footer.jsp"/>

