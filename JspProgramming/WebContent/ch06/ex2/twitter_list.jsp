<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("UTF-8");
	String username=request.getParameter("username");
	
	if(username != null){
		session.setAttribute("user", username);
	}
%>

<html>
	<head>
		<meta charset=" UTF-8">
		<title>Twitter</title>
		<style type="text/css">
			body {
				text-align: center;
			}
		</style>
	</head>
	<body>
	<div align="center">
		<h3>My Simple Twitter!!</h3>
		<hr />
		<form action = "twitter.jsp" method="post">
			<%= session.getAttribute("user") %> <input type="text" name="msg">
			<input type="submit" value="Twitt">
		</form>
		<div align="left">
			<ul>
				<%
					ArrayList<String>msgs=(ArrayList<String>)application.getAttribute("msgs");
				
					if(msgs != null){
						for(String msg : msgs) { 
							out.println("<LI>" + msg + "</LI>");
						}
					}
				%>
			</ul>
		</div>
	</div>
		
	</body>
</html>