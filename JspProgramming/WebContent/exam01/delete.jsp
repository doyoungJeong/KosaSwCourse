<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="dto.*" %>
<%
int boardNo = Integer.parseInt(request.getParameter("board_no"));
%>

<jsp:useBean id="boardService" class="service.BoardService" scope="application"/>

<% boardService.remove(boardNo);  
response.sendRedirect("list.jsp");%>