<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="dto.*" %>

<%
	int productNo = Integer.parseInt(request.getParameter("product_no"));	
%>

<jsp:useBean id="productService" class="service.ProductService" scope="application" />

<%Product product = productService.getProduct(productNo); %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset=" UTF-8">
		<title>Insert title here</title>
		
		<style type="text/css">
			body {
				font-family: "돋움";
				font-size: 12px;
			}
			
			span {
				display: inline-block;
			}
			
			span.title {
				border: 1px solid dargray;
				background: lightgray;
				width: 70px;
				margin: 1px 5px;;
			}
			
			pre {
				margin:10px;
				border: 1px solid darkgray;
				padding: 10px;
				height: 100px;
				font-size: 12px;
			}
		</style>
		
		<script type="text/javascript">
			function sendData(){
				//값의 유효성 검사
				
			/* 	var modifyForm = document.modifyForm;
		
				var no = document.modifyForm.productNo.value;
				console.log(no);
				var name = document.modifyForm.name.value;
				console.log(name);
				var size = document.modifyForm.size.value;
				console.log(size);
				var color = document.modifyForm.color.value;
				console.log(color);
				var amount = document.modifyForm.amount.value;
				console.log(amount);
				var price = document.modifyForm.price.value;
				console.log(price);
				var description = document.modifyForm.description.value;
				console.log(description);  */
				
				modifyForm.submit();
				
				//서버로 전송
			}
		</script>
	</head>
	<body>
		<h4>게시물 보기</h4>
		<form method="post" action="modify.jsp" name="modifyForm">
		
			<span class="title">상품번호 : </span>
			<span class="content" ><%=product.getProductNo() %></span><br />
			<input type="hidden" name="productNo" value="<%=product.getProductNo() %>">
			
			<span class="title">상품이름 :</span> 
			<input type="text" name="name" value="<%=product.getName() %>"><br />
			
			<span class="title">사이즈 :</span> 
			<input type="text" name="size" value="<%=product.getSize() %>"><br />
			
			<span class="title">색상 :</span> 
			<input type="text" name="color" value="<%=product.getColor() %>"><br />
			
			<span class="title">수량 :</span> 
			<input type="text" name="amount" value="<%=product.getAmount() %>"><br />
			
			<span class="title">가격 :</span> 
			<input type="text" name="price" value="<%=product.getPrice() %>"><br />
			
			<span class="title">내용 </span>
			<textarea cols="30" rows="5" name="description"><%=product.getDescription() %></textarea>
		</form>
		<div id="buttonGroup">
			<a href="javascript:sendData()">[수정]</a>
			<a href="detail.jsp?product_no=<%=product.getProductNo()%>">[취소]</a>

		</div>
		
	</body>
</html>