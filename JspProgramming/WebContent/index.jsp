<%@ page contentType="text/html; charset=UTF-8"%>



<!DOCTYPE html>
<html>
	<head>
		<meta charset=" UTF-8">
		<title>JspProgramming</title>
	</head>
	<style type="text/css">
		* {
			margin: 0px;
			padding: 0px;
		}
		body {
			width: 800px;
			margin: 0 auto;
			background-color: #E6E6E6;
			background-image: url('img/tower.jpg');
		/* 	background-color: rgba(255,255,0,0.5); */
		 	
		}
		#page_wrapper {
			background-color: #ffffff;
			margin: 40px 0px;
			padding: 10px 20px;
			
			
		}
		header {
			margin-bottom: 10px 
		}
		nav {
			border-top: 1px solid #c8c8c8;
			border-bottom: 1px solid #c8c8c8;
			display: flex;
			flex-direction: row;
		}
		.menu {
			/* justify-content: row;  */
			margin: 5px;
			width: 50px;
		}
		#content {
			display: flex;
			height: 500px;
			flex-direction: row;
			overflow: scroll;
		}	
		aside {
			display: inline-block;
			height: 500px;
			width: 250px;
			border-right: 1px solid #c8c8c8;
			overflow: scroll;
		}
		section {
			height: 400px;
			flex: 1;
		}
		footer {
			height: 50px;
			border-top:  1px solid #c8c8c8;
		}
		#iframe {
			border:0px;
			
		}
		#category {
			height: 35px;
	/* 		border: 1px; */
		}
		#category > a {
			border-radius: 20px;
			display: inline-block;
			box-shadow: 5px 5px 5px #a9a9a9;
			color: white;
			width: 80%;
			line-height: 24px;
			height: 70%;
			background-color: #5CD1E5;
			text-decoration: none;
			text-align: center;
			font-weight: bold;
			margin-bottom: 3px;
			margin-left: 30px;
		}
		#category > .chapter {
			box-shadow: 5px 5px 5px #a9a9a9;
			border-radius: 20px;
			display: inline-block;
			color: #005766;
			width: 80%;
			line-height: 40px;
			height: 100%;
			background-color: #B2EBF4;
			text-decoration: none;
			text-align: center;		
			margin-bottom: 1px;
			font-weight: bold;
		}
		
		#category > a:hover{
			background-color: aqua;
		}
	
	
		
	</style>
	<body>
		<div id="page_wrapper">
			<header>
				<h1>JspProgramming</h1>
			</header>
			<nav>
				<div class="menu">Menu1</div>	
				<div class="menu">Menu2</div>
				<div class="menu">Menu3</div>
				<div class="menu">Menu4</div>
				<div class="menu">Menu5</div>
			</nav>
			<div id="content">
				<aside>
					<div id="category">
						<p class="chapter">[ Ch04 : 서블릿 ]</p>
						<a href="HelloWorldServlet1" target="iframe">3.0 방식으로 등록</a>
						<a href="HelloWorldServlet2" target="iframe">이전 방식으로 등록</a>
						<a href="HelloWorldServlet3" target="iframe">load on startup</a>
						<a href="HelloWorldServlet4" target="iframe">외부 정보 받기</a>
						<a href="ch04/service_get_post.jsp" target="iframe">요청 방식별 처리</a>
						<a href="LoginServlet" target="iframe">요청 처리 및 응답 보내기</a>
					
						<p class="chapter">[ Ch05 : JSP 기초 문법 ]</p>
						<a href="ch05/comment.jsp" target="iframe">주석</a>
						<a href="ch05/directives/index.jsp" target="iframe">지시어</a>
						<a href="ch05/action/index.jsp" target="iframe">표준액션</a>
						<a href="ch05/dec_express/scriptlet1.jsp" target="iframe">스크립트릿1</a>	
						<a href="ch05/dec_express/scriptlet2.jsp" target="iframe">스크립트릿2</a>
						<a href="ch05/calc3.jsp" target="iframe">선언문</a>
						
						<p class="chapter">[ Ch06 : JSP 내장 객체 ]</p>
						<a href="ch06/builtin_object.jsp" target="iframe">JSP 내장객체 개요</a>
						<a href="ch06/request/index.jsp" target="iframe">request</a>
						<a href="ch06/response/index.jsp" target="iframe">response</a>
						<a href="ch06/cookie/index.jsp" target="iframe">cookie</a>
						<a href="ch06/session/index.jsp" target="iframe">session</a>
						<a href="ch06/application/index.jsp" target="iframe">application</a>
						<a href="ch06/ex1/login.jsp" target="iframe">기본 실습 1</a>
						<a href="ch06/ex2/twitter_login.jsp" target="iframe">응용 실습1</a>
						
						<p class="chapter">[ Ch07 : JSP 자바 빈즈]</p>
						<a href="ch07/dto.jsp" target="iframe">DTO 이용 방법</a>
						<a href="ch07/dto_auto_setting.jsp" target="iframe">DTO에 값 저장</a>
						<a href="ch07/bean_scope.jsp" target="iframe">빈의 사용 범위</a>
						<a href="ch07/database_form.jsp" target="iframe">데이타 베이스 연동</a>
						
						<p class="chapter">[ Ch10 : 표현 언어]</p>
						
						<p class="chapter">[ Ch11 : JSTL ]</p>
						<a href="ch11/forEach.jsp" target="iframe">&lt;c:forEach&gt;</a>
						
						<p class="chapter">[ 실습01 : 게시판]</p>
						<a href="exam01/list.jsp" target="iframe">게시판 목록</a>
						
						<p class="chapter">[ 실습02 : 게시판]</p>
						<a href="subject/productList.jsp" target="iframe">상품 목록</a>
						
						<p class="chapter">[ 실습03 : mvc 게시판]</p>
						<a href="mvc/board?action=list" target="iframe">게시판 목록</a>
					
					</div>					
				</aside>
				<section>
					<iframe name="iframe" width="100%" height="100%" id="iframe"></iframe>
				</section>
			</div>
			<footer>Jeong Doyoung(cusack)</footer>
		</div>
		
	</body>
</html>