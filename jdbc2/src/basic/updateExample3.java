package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateExample3 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://blueskii.iptime.org:3306/team4", "team4", "123456");
			System.out.println("연결 성공");
			// 매개변수화된 sql문 values(1, 2, 3)
			String sql = "update user18_boards set board_title=?, board_content=?, board_writer=? where board_no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "오늘은....");
			pstmt.setString(2, "난 그래도 10시까지 남아야지!!");
			pstmt.setString(3, "쿠삭");
			pstmt.setString(4, "1");
			int rows = pstmt.executeUpdate(); // 위 문장 실행시작, 데이터베이스에 실제로 입력되는 행의 수
			System.out.println(rows + "개의 행이 수정됨.");
			
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
