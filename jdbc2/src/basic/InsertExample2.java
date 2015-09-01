package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExample2 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://blueskii.iptime.org:3306/team0", "team0", "123456");
			// 매개변수화된 sql문 values(1, 2, 3)
			String sql = "insert into user0_boards (board_title, board_content, board_writer, board_date) values(?, ?, ?, now())";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "오늘은 화요일");
			pstmt.setString(2, "오늘은...............");
			pstmt.setString(3, "홍길동");
			int row = pstmt.executeUpdate(); // 위 문장 실행시작, 데이터베이스에 실제로 입력되는 행의 수
			System.out.println("1개의 행이 저장됨.");
			
		} catch (ClassNotFoundException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close(); // 예외가 중복이 되더라도 따로 트라이캐치해야한다. 예외 발생지점 아래부분은 실행안되기 때문에
			} catch (SQLException e1) {}
			try {
				conn.close();
			} catch (SQLException e) {}
		}
	}
}
