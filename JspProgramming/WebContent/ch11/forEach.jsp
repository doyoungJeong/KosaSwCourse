<%@page import="java.util.*"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset=" UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		forEach.jsp
		
		<hr />
		
		<c:forEach var="i"  begin="1" end="5">
			${i}<br>
		</c:forEach>
		
		<hr />
		
		<c:forEach var="i"  begin="1" end="10" step="2"> 
			${i}<br>
		</c:forEach>
		<hr />
		
		<%
		List<String> names = new ArrayList<String>();
		names.add("도영");
		names.add("희원");
		names.add("성현");
		names.add("예지");
		request.setAttribute("names", names);
		%>
		
		<c:forEach var="i"  items="${names}"  varStatus="status"> 
			status.first: ${status.first},
			status.last: ${status.last},
			status.index:  ${status.index},
			status.count: ${status.count}
			i: ${i}<br />
		</c:forEach>
		<hr />
		
		<c:forEach var="name"  items="${names}"  varStatus="status">
			<c:if test="${status.first}"><!--  if() 조건식에 들어가는 내용이 test에 들어간다. -->
				<ul>
				

			</c:if>   
					<li>${name}</li>
				
			<c:if test="${status.last}">
				</ul>
			</c:if>
			   
		</c:forEach>
		
	<%-- 	<c:forEach var="i"  items="${names}"  varStatus="status"> 
			status.index:  ${status.index},
			status.count: ${status.count}
			i: ${i}<br />
		</c:forEach> --%>
		
	</body>
</html>