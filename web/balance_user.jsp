<%@ include file="autentication.jsp" %>

<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:include page="header_user.jsp">
<jsp:param name="PAGE_TITLE" value="TPWQuotes"/>
</jsp:include>
<div id="menu">
  <ul>
    <li><a href="user.jsp" title="Charts"><span>Profile</span></a></li>
    <li><a href="balance_user.jsp" title="Balance"><span>Balance</span></a></li>
    <li><a href="loans_user.jsp" title="Loans"><span>Loans</span></a></li>
    <li><a href="charts_user.jsp" title="Charts"><span>Charts</span></a></li>
  </ul>
</div>
<div id="page">
	<% For () {/* Carregar a Balance do user para cada data */%>
		<div>
			<b><p>Date: <%=b.getDate()%></p>
			<b><p>Fund: <br/><%=b.getFund()%></p>
			<b><p>Debit: <br/><font color="red"><%b.getDebit()%></font></p>
		</div>
	<%}//Fim do for%>
</div>
<jsp:include page="footer.jsp"/>
