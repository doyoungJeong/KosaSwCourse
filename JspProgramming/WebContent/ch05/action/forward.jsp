<%@page import="java.net.URLEncoder"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<%
	String email = request.getParameter("email");
	String name = "삼겹살";
	name = URLEncoder.encode(name, "UTF-8");
	
%>



<jsp:forward page="forwardForm.jsp">
	<jsp:param value="pizza" name="id" />
	<jsp:param value="<%=name %>" name="name" />
</jsp:forward>
