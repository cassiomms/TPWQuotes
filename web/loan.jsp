<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header.jsp">
	<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
	Solicitar Emprestimo<br>
	<form action = "#" id="loan_form" method="post" enctype="multpart/form-data">
		Valor: <input type="text" size="50" id="value" name="value" />
		<input type="submit" value="Submit" class="button"/>
	</form>
</div>

<jsp:include page="footer.jsp"/>

