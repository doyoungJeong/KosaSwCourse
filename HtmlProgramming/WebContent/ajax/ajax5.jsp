<%@ page contentType="text/html; charset=UTF-8"%>

<%
String mid = request.getParameter("mid");  
String mpass = request.getParameter("mpass"); 
%> 

<%if(mid.equals("fall")) { %>
	<%if(mpass.equals("12345")) { %>
		success
	<% } else {  %>
		fail_mpass
	<% } %>
<% } else { %>
	fail_mid
<% } %>