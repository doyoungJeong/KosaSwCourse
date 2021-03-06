package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class SelectExample1 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://blueskii.iptime.org:3306/team4", "team4", "123456");
			// 매개변수화된 sql문 values(1, 2, 3)
			String sql = "select * from user18_boards where board_content like ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%오늘%");
			ResultSet rs = pstmt.executeQuery();  // select는 executeQuery 
			
			while(rs.next()){
				int boardNo = rs.getInt("board_no");
				String boardTitle = rs.getString("board_title");
				String boardContent = rs.getString("board_content");
				Date boardDate = rs.getDate("board_date");
				String boardWriter = rs.getString("board_writer");
				int boardHitcount = rs.getInt("board_hitcount");
				
				System.out.println(boardNo + "\t" + boardTitle + "\t" + boardContent + "\t");
			}
			rs.close();
								
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
