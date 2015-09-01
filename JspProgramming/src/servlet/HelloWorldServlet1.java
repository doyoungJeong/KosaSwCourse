package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//어노페이션 servlet 3.0부터 나왔다.
@WebServlet("/HelloWorldServlet1") // url 맵핑을 시킨다. 이와 같은 이름의 service메소드를 실행한다.
public class HelloWorldServlet1 extends HttpServlet { // singleton으로 동작하는 클래스
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HelloWorldServlet1.service()");
	}
}
