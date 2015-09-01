<%@ page contentType="text/html; charset=UTF-8"%>

<%
	int no = Integer.parseInt(request.getParameter("no"));
%>

<%-- <nav class="menu">
	<% if(no==1) { %>
		<div class="menuitem selected">Menu1</div>
		<div class="menuitem">Menu2</div>
		<div class="menuitem">Menu3</div>
	<% } else if(no==2) { %>	
		<div class="menuitem">Menu1</div>
		<div class="menuitem selected">Menu2</div>
		<div class="menuitem">Menu3</div>
	<% } else if(no==3) { %>
		<div class="menuitem">Menu1</div>
		<div class="menuitem">Menu2</div>
		<div class="menuitem selected">Menu3</div>
	<% } %>
</nav> --%>

<nav class="menu">
		<div class="menuitem <%=(no==1)?"selected" : ""%>">Menu1</div>
		<div class="menuitem <%=(no==2)?"selected" : ""%>">Menu2</div>
		<div class="menuitem <%=(no==3)?"selected" : ""%>">Menu3</div>
</nav>

