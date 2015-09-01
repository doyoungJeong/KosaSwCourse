<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:useBean id="board1" class="dto.Board"  scope="page"/>
<jsp:useBean id="board2" class="dto.Board"  scope="request"/>
<jsp:useBean id="board3" class="dto.Board"  scope="session"/> 
<jsp:useBean id="board4" class="dto.Board"  scope="application"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset=" UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		board1: <jsp:getProperty property="title" name="board1" /> <br />
		board2: <jsp:getProperty property="title" name="board2" /> <br />
		board3: <jsp:getProperty property="title" name="board3" /> <br />
		board4: <jsp:getProperty property="title" name="board4" /> <br />
	
		
	</body>
</html>