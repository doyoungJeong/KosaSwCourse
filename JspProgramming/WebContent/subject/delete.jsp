<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="dto.*" %>
<%
int productNo = Integer.parseInt(request.getParameter("product_no"));
%>

<jsp:useBean id="productService" class="service.ProductService" scope="application"/>

<% productService.remove(productNo);  
response.sendRedirect("productList.jsp");%>