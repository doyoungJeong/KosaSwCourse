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
			System.out.println("���� ����");
			// �Ű�����ȭ�� sql�� values(1, 2, 3)
			String sql = "update user18_boards set board_title=?, board_content=?, board_writer=? where board_no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "������....");
			pstmt.setString(2, "�� �׷��� 10�ñ��� ���ƾ���!!");
			pstmt.setString(3, "���");
			pstmt.setString(4, "1");
			int rows = pstmt.executeUpdate(); // �� ���� �������, �����ͺ��̽��� ������ �ԷµǴ� ���� ��
			System.out.println(rows + "���� ���� ������.");
			
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
