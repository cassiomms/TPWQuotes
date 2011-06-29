<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header.jsp">
	<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
	<menu>
		<li><a href="carteira.jsp">Carteira</a><br></li>
		<li><a href="compra.jsp">Comprar</a><br></li>
		<li><a href="venda.jsp">Vender</a><br></li>
		<li><a href="emprestimo.jsp">Emprestimo</a><br></li>
		<li><a href="logout.jsp">Logout</a><br></li>
	</menu>
</div>

<jsp:include page="footer.jsp"/>

