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
			// �Ű�����ȭ�� sql�� values(1, 2, 3)
			String sql = "select * from user18_boards where board_content like ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%����%");
			ResultSet rs = pstmt.executeQuery();  // select�� executeQuery 
			
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
			System.out.println("���� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close(); // ���ܰ� �ߺ��� �Ǵ��� ���� Ʈ����ĳġ�ؾ��Ѵ�. ���� �߻����� �Ʒ��κ��� ����ȵǱ� ������
			} catch (SQLException e1) {}
			try {
				conn.close();
			} catch (SQLException e) {}
		}
	}
}
