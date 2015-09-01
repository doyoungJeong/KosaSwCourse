<%@ page contentType="text/html; charset=UTF-8"%>




<% request.setCharacterEncoding("UTF-8"); %>
<%-- 클라이언트가 보낸 데이터를 Board 객체에 저장 --%> 
<%-- database_form에서 보낸 데이터들을 board객체를 생성해서 필드에 저장한다. --%>
<jsp:useBean id="board" class="dto.Board"> 
	<jsp:setProperty name="board" property="*" />
</jsp:useBean>


<%-- application 범위의 BoardService 객체 사용 --%>
<%-- boardService객체 생성하고 사용범위를 application으로 지정한다. --%>
<jsp:useBean
 	id="boardService" 
 	class="service.BoardService"
 	scope="application" />
 	
<%-- BoardService의 add() 메소드를 호출 --%>
<% boardService.add(board); %>

<%-- BoardService의 add() 메소드를 호출 --%>
<% response.sendRedirect("list.jsp"); %>