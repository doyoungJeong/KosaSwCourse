<%@ page contentType="text/html; charset=UTF-8"%>

<%
	int age = 25;
%>
<jsp:forward page="h.jsp">
	<jsp:param value="<%=age %>" name="age"/>
</jsp:forward>