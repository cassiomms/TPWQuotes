<%@ include file="autentication.jsp" %>

<%@ page contentType="text/html; charset=UTF-8"%>
<@ page import="tpwquotes.model.*, java.util.*%>

<jsp:include page="header.jsp">
	<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
	<big><b>Your wallet:<br></big></b>
	<% For () {/* Carregar as quotes do usuario */%>
		<div>
			<p>Name: <%=w.getName()%></p>
			<p>Quantity: <br/><%w.getQuantity()%></p>
		</div>
	<%Fim do For%>
</div>

<jsp:include page="footer.jsp"/>

