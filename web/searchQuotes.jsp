<%@ include file="autentication.jsp" %>

<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header.jsp">
<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
	<div>
		<big><b>Search the quotes:</big></b><br>
		<form id="form" name="searchQuotesToBuy_form" method="post" action="searchQuotes.jsp">
			  <span>
			  <input name="q" type="text" class="keywords" id="code" maxlength="50" value="Search..." />
			  <input name="b" type="image" src="static/images/search.gif" class="button" />
			  </span>
		</form>
	</div>
	<%/*Buscar as quotes desejadas*/%>
	<div>
			<p>Name: <%=t.getName()%></p>
			<p>Value: <br/><%=t.getValue()%></p>
			<form action="#" name="indicatedQuotes_form" method="post">
				<input type="text" name="quantity" value="<%/*Valor da quantidade que sera usado para calcular o total*/%>"/>
				<input type="submit" name="action" value="Sell" />			
			</form>
	</div>
</div>

<jsp:include page="footer.jsp"/>
