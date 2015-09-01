<%@ page contentType="text/html; charset=UTF-8"%>

<%String method = request.getMethod(); %> <!-- 요청방식을 리턴한다. -->


<% if(method.equals("GET")) { %>
<h4>get방식 요청 결과.</h4>
<img src="common/images/avata/030627_01.gif" />

<% } else if (method.equals("POST")) { %>
<h4>post방식 요청 결과.</h4>
<img src="common/images/avata/030627_01.gif" />
<% } %>