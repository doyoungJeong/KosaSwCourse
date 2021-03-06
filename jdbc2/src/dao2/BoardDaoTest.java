package dao2;

import java.sql.Connection;
import java.sql.SQLException;

public class BoardDaoTest {

	public static void main(String[] args) throws Exception{
		Board board = new Board();
		Connection conn = ConnectionManager.getConnection();
		BoardDao boardDao = new BoardDao(conn);
		board.setTitle("오늘은 DAO를 만드는 날");
		board.setContent("DAO가 참 유용하네요. 연습을 많이 해야 될 것 같습니다.");
		board.setWriter("홍길동");
		Integer pk = boardDao.insert(board);
		if(pk != null) {
			System.out.println(pk + "번 게시물이 저장됨");
		} else {
			System.out.println("저장 실패");
		}
	}

}
