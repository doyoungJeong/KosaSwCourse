<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset=" UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		save.jsp
		<hr />
		<%
			session.setAttribute("name1", "cusack");
			session.setAttribute("name2", "도영");
		%>
		세션에 잘 저장되었습니다.
	</body>
</html>