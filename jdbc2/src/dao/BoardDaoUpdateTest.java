package dao;

public class BoardDaoUpdateTest {
	public static void main(String[] args) {

		Board board = new Board();
		board.setNo(18);
		board.setTitle("오늘은 DAO를 합니다.");
		board.setContent("DAO가 참 쉽네요.");
		board.setHitcount(2);

		BoardDao boardDao = BoardDao.getInstatnce();
		int rows = boardDao.update(board);
		if (rows == 1) {
			System.out.println(board.getNo()+ "번 게시물이 수정됨.");
		} else {
			System.out.println(board.getNo() + "번 게시물이 존재하지 않습니다.");
		}

	}
}
