<%@ include file="autentication.jsp" %>
<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header_user.jsp">
<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
	<center><big><b>Solicitar Emprestimo<br>
	<form action = "loanservlet" id="loan_form" method="post" enctype="multpart/form-data">
	<p align="center"><input type="hidden" name="type" value="7"/></p>
	<p align="center"><b>Valor: <input type="text" size="15" id="value" name="value" /></p>
	<p align="center"><input type="submit" value="Solicitar" class="button"/></p>
	</form>


	<center><big><b>Pagar Emprestimo<br>
	<form action = "loanservlet" id="loan_form" method="post" enctype="multpart/form-data">
	<p align="center"><input type="hidden" name="type" value="8"/></p>
	<p align="center"><b>Valor do Pagamento: <input type="text" size="15" id="value" name="value" /></p>
	<p align="center"><input type="submit" value="Pagar" class="button"/></p>
	</form>
</div>  

<jsp:include page="footer.jsp"/>
