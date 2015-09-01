package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
	public static void main(String[] args) {
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://blueskii.iptime.org:3306/team4", "team4", "123456");
			System.out.println("연결 성공");

		} catch (ClassNotFoundException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}

		/*
		 * try { Class.forName("oracle.jdbc.OracleDriver"); conn =
		 * DriverManager.getConnection(
		 * "jdbc:oracle:thin:@70.12.108.154:1521:orcl", "user18", "12345");
		 * System.out.println("연결 성공");
		 * 
		 * } catch (ClassNotFoundException e) { System.out.println("연결 실패");
		 * e.printStackTrace(); } catch (SQLException e) { System.out.println(
		 * "연결 실패"); e.printStackTrace(); } finally { try { conn.close(); }
		 * catch (SQLException e) {} }
		 */
	}
}
