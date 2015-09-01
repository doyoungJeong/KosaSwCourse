<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.net.*" %>
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
			String name1 = URLEncoder.encode("홍길동", "UTF-8");
			System.out.println(name1);
			Cookie cookie1 = new Cookie("name1", name1);
			response.addCookie(cookie1); // 메모리에만 저장한다.
		
			Cookie cookie2 = new Cookie("name2", "doyoung");
			cookie2.setMaxAge(60*60); // 이 문장으로 인해 하드디스크에 저장한다.
			response.addCookie(cookie2);
		%>
		
		쿠키가 잘 저장되었습니다.
	</body>
</html>