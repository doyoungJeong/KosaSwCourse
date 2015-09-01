package dao2;

import java.sql.Connection;

public class BoardDaoDeleteTest {

	public static void main(String[] args) throws Exception {
		Board board = new Board();
		Connection conn = ConnectionManager.getConnection();
		BoardDao boardDao = new BoardDao(conn);
		int rows = boardDao.delete(18);
		if (rows == 1) {
			System.out.println(18 + "�� �Խù��� ������");
		} else {
			System.out.println(18 + "�� �Խù��� �������� ����");
		}
		conn.close();
	}

}
