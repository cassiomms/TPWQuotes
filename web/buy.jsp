<%@ include file="autentication.jsp" %>

<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header.jsp">
<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>

<div id="page">
	<div>
		<big><b>Buy your quote:</big></b><br>
		<form id="buy_form" method="post" action="buyservlet">
			  <span>
			  <p align="center">Quote:     <input type="text" id="quote" name="quote" /></p>
			  <p align="center">Quantity:     <input type="text" id="quantity" name="quantity" /></p>
			  <p align="center"><input name="buy" type="image" src="static/images/submit.gif" class="button" /></p>
			  </span>
		</form>
	</div>
	
</div>

<jsp:include page="footer.jsp"/>
