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
  <p><p><p></p></p></p>
	<div>
		<h3>User's photo
		<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img height="50" width="50" src="static/images/userpic.gif<%/*Inserir a foto aqui*/%>" alt="User's photo">
	</div>	  
</div>
<jsp:include page="footer.jsp"/>
