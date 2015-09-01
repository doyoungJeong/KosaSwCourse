<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="dto.*" %>
<%
int productNo = Integer.parseInt(request.getParameter("product_no"));
%>

<jsp:useBean id="productService" class="service.ProductService" scope="application"/>

<%-- <%
//조회수 증가
productService.addHitcount(boardNo); 
%> --%>



<%Product product = productService.getProduct(productNo); %> 

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			body {
				
				font-size: "12px";
			}
			/* @font-face {
   					font-family: MANIFESTO;
   					src: url(MANIFESTO.ttf);
					} */
			span {
				display: inline-block;
				margin: 2px 10px;
			}
			span.title {
				margin: 2px 10px;
				border: 1px solid darkgray;
				background: #B2CCFF;
				width: 70px;
				text-align: center;
			}
			pre {
				margin: 10px;
				border: 1px solid darkgray;
				padding: 10px;
				width: 300px;
				height: 100px;
				font-sixe:12px;
			}
		</style>
	</head>
	
	<body>
		<h4>상품 상세정보 보기</h4>
		<span class="title">상품번호:</span> <span class="content"><%=product.getProductNo() %></span>	<br/>
		<span class="title">상품이름</span> <span class="content"><%=product.getName() %></span>	<br/>
		<span class="title">색상</span> <span class="content"><%=product.getColor() %></span>		<br/>
		<span class="title">사이즈</span> <span class="content"><%=product.getSize() %>	<br/></span>
		<span class="title">수량:</span> <span class="content"></span><%=product.getAmount() %><br/>
		<span class="title">가격:</span><span class="content"><%=product.getPrice() %></span> <br/>
		<span class="title">상품설명</span><span class="content"><%=product.getDescription() %></span> <br/><br/>
		
		
		<div id= "buttonGroup" >
			<a href="productList.jsp"><img src="img/list.png" width="30px" height="30px" ></a>
			<a href="modify_form.jsp?product_no=<%=product.getProductNo() %>"><img src="img/modify.png" width="30px" height="30px" ></a>
			<a href="delete.jsp?product_no=<%=product.getProductNo() %>"><img src="img/delete.png" width="30px" height="30px" ></a>
		</div>
	</body>
</html>