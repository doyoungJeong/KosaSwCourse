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
			// �Ű�����ȭ�� sql�� values(1, 2, 3)
			String sql = "insert into user0_boards (board_title, board_content, board_writer, board_date) values(?, ?, ?, now())";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "������ ȭ����");
			pstmt.setString(2, "������...............");
			pstmt.setString(3, "ȫ�浿");
			int row = pstmt.executeUpdate(); // �� ���� �������, �����ͺ��̽��� ������ �ԷµǴ� ���� ��
			System.out.println("1���� ���� �����.");
			
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
