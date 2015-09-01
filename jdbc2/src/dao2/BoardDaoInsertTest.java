package dao2;

import java.sql.Connection;

public class BoardDaoInsertTest  {

	public static void main(String[] args) throws Exception {
		Board board = new Board();
		Connection conn = ConnectionManager.getConnection();
		BoardDao boardDao = new BoardDao(conn);
		board.setTitle("������ DAO�� ����� ��");
		board.setContent("DAO�� �� �����ϳ׿�. ������ ���� �ؾ� �� �� �����ϴ�.");
		board.setWriter("ȫ�浿");

		Integer pk = boardDao.insert(board);
		if(pk != null) {
			System.out.println(pk + "�� �Խù��� �����");
		} else {
			System.out.println("���� ����");
		}
	}

}
