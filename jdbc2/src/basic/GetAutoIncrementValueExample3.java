package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetAutoIncrementValueExample3 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://blueskii.iptime.org:3306/team4", "team4", "123456");
			// �Ű�����ȭ�� sql�� values(1, 2, 3)
			String sql = "insert into user18_boards (board_title, board_content, board_writer, board_date) values(?, ?, ?, now())";
			pstmt = conn.prepareStatement(sql, new String[] {"board_no"});
			pstmt.setString(1, "������ ȭ����");
			pstmt.setString(2, "������...............");
			pstmt.setString(3, "ȫ�浿");
			int row = pstmt.executeUpdate(); // �� ���� �������, �����ͺ��̽��� ������ �ԷµǴ� ���� ��
			int boardNO=0;
			System.out.println(row + "���� �����.");
			
			if(row ==1){
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()){
					boardNO = rs.getInt(1);
				}
				rs.close();
			}
			
			System.out.println(boardNO + "�� �Խù��� �����.");
	
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
