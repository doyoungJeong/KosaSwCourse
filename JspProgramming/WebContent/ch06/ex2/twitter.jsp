<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset=" UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			body {
				text-align: center;
			}
		</style>
	</head>
	<body>
		<%
			request.setCharacterEncoding("UTF-8");
			String msg = request.getParameter("msg");
			Object username = session.getAttribute("user");
			
			ArrayList<String> msgs =(ArrayList<String>)application.getAttribute("msgs");
			
			if(msgs == null){
				msgs = new ArrayList<String>();
				application.setAttribute("msgs", msgs);
			}
			
			msgs.add(username+ " :: " + msg+ " , " + new java.util.Date());
			application.log(msg+"추가됨");
			
			response.sendRedirect("twitter_list.jsp");
		%>
	</body>
</html>