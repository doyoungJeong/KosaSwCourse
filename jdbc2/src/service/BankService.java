package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao2.ConnectionManager;

public class BankService {
	public void transfer(int from, int to, int amount) {
		Connection conn = null;
		try {
			conn = ConnectionManager.getConnection();
			//Ʈ����� �۾� ����
			conn.setAutoCommit(false); // �������� Ŀ�Էѹ��� �����ϰ� ����.		
			AccountDao accountDao = new AccountDao(conn);
			
			//����۾�
			Account fromAccount = accountDao.selectByPk(from);
			fromAccount.setBalance(fromAccount.getBalance() - amount);
			accountDao.update(fromAccount);
			//�Ա��۾�
			Account toAccount = accountDao.selectByPk(to);
			toAccount.setBalance(toAccount.getBalance() + amount);
			accountDao.update(toAccount);
			conn.commit();
		} catch (Exception e) {
			try {				conn.rollback();		} catch (SQLException e1) {	}
			System.out.println("������ü����");
			e.printStackTrace();
		} finally {
			{
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
