<%@ include file="autentication.jsp" %>

<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header.jsp">
	<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
	<% For () {/* Carregar acoes a serem vendidas */%>
		<div>
			<p>Name: <%=t.getName()%></p>
			<p>Value: <br/><%=t.getValue()%></p>
			<p>Quantity: <br/><%t.getQuantity()%></p>
			<form action="#" method="post">
				<select name="quantity">
					<option></option>
					<%  /*Carregar a quantidade maxima de acoes a serem vendidas*/
						integer count=0;
						for(count=0;count<=t.getQuantity();count++){
							System.out.println("<option value=\"count\">count</option>");
						}%>
				</select>
				<input type="submit" name="action" value="Sell" />			
			</form>
		</div>
	<%/*Fim do for*/%>
</div>

<jsp:include page="footer.jsp"/>

