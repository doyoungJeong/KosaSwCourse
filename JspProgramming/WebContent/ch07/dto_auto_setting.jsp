<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="dto.*" %>
<%String method = request.getMethod(); %>

<%if(method.equals("GET")) { %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset=" UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
	</head>
	<body>
		<form method="POST" >
		<table id="form_table">
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td>글쓴이</td>
				<td><input type="text" name="writer" /></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="content" rows="5" cols="50"></textarea></td>
			</tr>
		</table>
		<input type="submit" value="글 올리기" />
		<input type="image" src="common/images/add_list.png"  width="20px" height="20px"/>
		<input type="reset" value="다시작성" />
		</form>
	</body>
</html>

<%} else if(method.equals("POST")) {  %>
	<%
	Board board1 = new Board();
	board1.setTitle(request.getParameter("title"));
	board1.setWriter(request.getParameter("Writer"));
	board1.setContent(request.getParameter("content"));
	%>
	
	title : <%=board1.getTitle() %> <br />
	writer: <%=board1.getWriter() %> <br />
	content : <%=board1.getContent() %> <br />
	
	<%-- <jsp:useBean id="board2" class="dto.Board"> // 38~44라인까지의 코드와 같은 내용
		<jsp:setProperty name="board2" property="*" />
	</jsp:useBean> --%>
	
	<jsp:useBean id="board2" class="dto.Board">
		<jsp:setProperty name="board2" property="title" />
		<jsp:setProperty name="board2" property="writer" />
		<jsp:setProperty name="board2" property="content" />
	</jsp:useBean>
	
	title : <%=board2.getTitle() %> <br />
	writer: <%=board2.getWriter() %> <br />
	content : <%=board2.getContent() %> <br />
	
	
<% } %>


