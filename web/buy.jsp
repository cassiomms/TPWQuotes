<%@ include file="autentication.jsp" %>

<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header.jsp">
<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
	Listar acoes disponiveis para compra:<br>
	<form action="#" id="listbuy_form" method="post" >
		<input type="Submit" value="List" class="button"/>
		<ul>
		<%  for () /*Seleciona as compras disponiveis do usuario*/
		<li>Name: </li>
		<li>Value: </li>
		%>
		</ul>
	</form>
</div>

<jsp:include page="footer.jsp"/>
