package dao2;

import java.sql.Connection;

public class BoardDaoDeleteTest {

	public static void main(String[] args) throws Exception {
		Board board = new Board();
		Connection conn = ConnectionManager.getConnection();
		BoardDao boardDao = new BoardDao(conn);
		int rows = boardDao.delete(18);
		if (rows == 1) {
			System.out.println(18 + "번 게시물이 삭제됨");
		} else {
			System.out.println(18 + "번 게시물이 존재하지 않음");
		}
		conn.close();
	}

}
