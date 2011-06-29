<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header.jsp">
	<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
	Listar acoes disponiveis para compra:<br>
	<form action="#" id="listbuy_form" method="post" >
		<ul>
			<li>Name: </li>
			<li>Value: </li>
		</ul>
		<input type="Submit" value="List" class="button"/>
	</form>
</div>

<jsp:include page="footer.jsp"/>

