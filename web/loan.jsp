<%@ include file="autentication.jsp" %>
<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header_user.jsp">
<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
	<center><big><b>Solicitar Emprestimo<br>
	<form action = "#" id="loan_form" method="post" enctype="multpart/form-data">
	<p align="center"><b>Valor: <input type="text" size="15" id="value" name="value" /></p>
	<p align="center"><input type="submit" value="Submit" class="button"/></p>
	</form>
</div>  

<jsp:include page="footer.jsp"/>