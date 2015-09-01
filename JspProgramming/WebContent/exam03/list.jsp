<%@ page contentType="text/html; charset=UTF-8"%>

<%@taglib prefix ="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			table {
				width: 100%;
				border-collapse: collapse;
				font-size: small;
			}
			table, th, td {
				border: 1px solid black;
				text-align: center;
			}
			th {
				background-color: aqua;
			}
			
			#buttonGroup {
				margin: 10px;
				text-align: center;
			}
			#pager {
				margin-top: 5px;
				text-align: center;
				font-size: small;
				
			}
			
			#pager a {
				text-decoration: none;'
				color: black;
			}
			
			#pager a:hover {
				color: green;
			}
			
			#pager a.pageNo {
				margin-left: 5px;
				margin-right: 5px;
			}
		</style>
	</head>
	
	<body>
		<h4>게시물 목록</h4>
		
		<table>
			<tr>
				<th style="width:50px">번호</th>
				<th>제목</th>
				<th style="width:60px">글쓴이</th>
				<th style="width:80px">날짜</th>
				<th style="width:60px">조회수</th>
			</tr>
		
			<c:forEach var="board"  items= "${list}" >
			<tr>
				<td>${board.no}</td>
				<td>${board.title}</td>
				<td>${board.writer}</td>
				<td>${board.date}</td>
				<td>${board.hitcount}</td>
			</tr>
			</c:forEach>
		
		</table>
		
		<div id="buttonGroup">
			<a href="../mvc/board?action=writeForm">   <!-- boardController에 writeForm메소드를 만든다. -->
				<img src="img/new.png" width="30px" height="30px" />
			</a>
		</div>
	</body>
</html>








