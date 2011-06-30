<%@ include file="autentication.jsp" %>

<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header_user.jsp">
<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
	<% /*for (;;) { Carregar a Balance do user para cada data */%>
		<div>
			<b><p>Date: <%/*=b.getDate();*/%></p>
			<b><p>Fund: <br/><%/*=b.getFund();*/%></p>
			<b><p>Debit: <br/><font color="red"><%/*b.getDebit();*/%></font></p>
		</div>
	<%/*}Fim do for*/%>
</div>

<jsp:include page="footer.jsp"/>
