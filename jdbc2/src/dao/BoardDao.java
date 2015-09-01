package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	private static BoardDao singleton = new BoardDao();
	private BoardDao() {

	}

	public static BoardDao getInstatnce() {
		return singleton;
	}
	
	//������ �۾� �޼ҵ�
	public Integer insert(Board board){
		Integer pk = null;
		String sql = "insert into boards (board_title, board_content, board_writer) values(?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@70.12.108.154:1521:orcl",
					"user0",
					"12345");
			// �Ű�����ȭ�� sql�� values(1, 2, 3)
			pstmt = conn.prepareStatement(sql, new String[] {"board_no"});
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			int row = pstmt.executeUpdate(); // �� ���� �������, �����ͺ��̽��� ������ �ԷµǴ� ���� ��
		
			System.out.println(row + "���� �����.");
			
			if(row ==1){
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()){
					pk = rs.getInt(1);
				}
				rs.close();
			}
	
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
		
		
		return pk;
	}
	
	public int update(Board board){  //�뵵�� ���� ������ ����� �ȴ�.
		int rows = 0; // ������ ���� ��
		
		String sql = "update boards set board_title=?, board_content=?, board_hitcount=? where board_no=?";
		
		Integer pk = null;	
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@70.12.108.154:1521:orcl",
					"user0",
					"12345");
			// �Ű�����ȭ�� sql�� values(1, 2, 3)
			pstmt = conn.prepareStatement(sql, new String[] {"board_no"});
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getHitcount());
			pstmt.setInt(4, board.getNo());
			rows = pstmt.executeUpdate(); // �� ���� �������, �����ͺ��̽��� ������ �ԷµǴ� ���� ��
			
			if(rows ==1){
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()){
					pk = rs.getInt(1);
				}
				rs.close();
			}
	
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
		
		return rows;
	}
	
	public List<Board> SelectByPage(int pageNo, int rowsPerPage){
		List<Board> list = new ArrayList<Board>();
		
		String sql = "select ";
		
		return list;
	}
	
}
