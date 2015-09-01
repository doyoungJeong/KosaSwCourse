<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="dto.* ,java.util.*" %>

<jsp:useBean id="ProductService" class="service.ProductService" scope="application" />

<%
List<Product> list = ProductService.getPage(1, 10);
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset=" UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
		
			table {
				border-collapse: collapse;
				width:100%;
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
				text-align: center;
				margin: 10px;
			}
					
		</style>
	</head>
	<body>
		<h4>게시물 목록</h4>
		<table>
			<tr>
				<th style="width:50px">품번</th>
				<th >상품이름</th>
				<th style="width:60px">사이즈</th>
				<th style="width:60px">색상</th>
				<th style="width:60px">가격</th>
			</tr>
			
			<% for(Product product: list) { %>
			<tr>
				<td><%=product.getProductNo() %></td>
				<td><a href="detail.jsp?product_no=<%=product.getProductNo()%>"><%=product.getName() %></a></td>
				<td><%=product.getSize() %></td>
				<td><%=product.getColor() %></td>
				<td><%=product.getPrice() %></td>
			</tr>	
			<%  } %>	
		</table>
		<div id="buttonGroup">
			<a href="write_form.jsp">
				<img src="img/new.png" style="width:50px; height: 50px;" />
			</a>
		</div>
	</body>
</html>