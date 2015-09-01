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
		<h2>계산</h2>
		선택한 상품 목록
		<hr>
		<%
			ArrayList list = (ArrayList)session.getAttribute("productlist");
			if(list == null){
				out.println("선택한 상품이 없습니다.");
				
			} else {
				for(Object productname: list){
					out.println(productname+"<br>");
				}
			}
		%>
	</body>
</html>