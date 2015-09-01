package dao2;

import java.sql.Connection;
import java.util.List;

public class BoardDaoSelectByPageTest {

	public static void main(String[] args) throws Exception  {
		Connection conn = ConnectionManager.getConnection();
		BoardDao boardDao = new BoardDao(conn);

		List<Board> list = boardDao.selectByPage(2, 10);
		for(Board board : list) {
			System.out.print("번호: " + board.getNo() + "\t");
			System.out.print("제목: " + board.getTitle()+ "\t");
			System.out.print("날짜: " + board.getDate()+ "\t");
			System.out.print("글쓴이: " + board.getWriter()+ "\t");
			System.out.println("조회수: " + board.getHitcount()+ "\t");
		}
		
	}

}
