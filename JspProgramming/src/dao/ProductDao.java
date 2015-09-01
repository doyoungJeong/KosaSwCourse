package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Board;
import dto.Product;

public class ProductDao {
	private static Connection conn;

	public ProductDao(Connection conn){
		this.conn = conn;
	}
	
	public Integer insert(Product product) throws SQLException{
		Integer pk = null;
		String sql = "insert into products2 (product_name, product_size, product_color, product_price, product_description, product_amount) values( ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql, new String[] { "product_no" } );
		pstmt.setString(1, product.getName());
		pstmt.setString(2, product.getSize());
		pstmt.setString(3, product.getColor());
		pstmt.setInt(4, product.getPrice());
		pstmt.setString(5, product.getDescription());
		pstmt.setInt(6, product.getAmount());
		
		
		int rows = pstmt.executeUpdate();
		if(rows == 1){
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next()){
				pk = rs.getInt(1);
			}
			rs.close();
		}
		pstmt.close();
		return pk;
	}

	public static List<Product> selectByPage(int pageNo, int rowsPerPage) throws SQLException {
		List<Product> list = new ArrayList<Product>();
		String sql = "";
		sql += "select product_no, product_name, product_size, product_color, product_price "; 
		sql += "from products2 ";
		sql += "order by product_no desc ";
		sql += "limit ?, ?";  //시작행부터 몇 개
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, (pageNo - 1)*rowsPerPage);
		pstmt.setInt(2,  rowsPerPage);
		pstmt.executeQuery();
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			Product product = new Product();
			product.setProductNo(rs.getInt("product_no"));
			product.setName(rs.getString("product_name"));
			product.setSize(rs.getString("product_size"));
			product.setColor(rs.getString("product_color"));
			product.setPrice(rs.getInt("product_price"));
			list.add(product);
		}
		rs.close();
		pstmt.close();
		return list;

	}
	public Product selectByPk(int productNo) throws SQLException {
		Product product = null;
		String sql = "select * from products2 where product_no=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, productNo);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			product= new Product();
			product.setProductNo(rs.getInt("product_no"));
			product.setName(rs.getString("product_name"));
			product.setColor(rs.getString("product_color"));
			product.setSize(rs.getString("product_size"));
			product.setDescription(rs.getString("product_description"));
			product.setPrice(rs.getInt("product_price"));  
			product.setAmount(rs.getInt("product_amount"));  
		}
		rs.close();
		pstmt.close();
		
		return product;
	}
	
	public int update(Product product) throws SQLException {
		int rows = 0;
		
		String sql = "update products2 set product_name=?, product_size=?, product_color=?, product_description=? , product_amount=? , product_price=? where product_no=? ";


		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, product.getName());
		pstmt.setString(2, product.getSize());
		pstmt.setString(3, product.getColor());
		pstmt.setString(4, product.getDescription());
		pstmt.setInt(5, product.getAmount());
		pstmt.setInt(6, product.getPrice());
		pstmt.setInt(7, product.getProductNo());
		rows = pstmt.executeUpdate();
		pstmt.close();
		return rows;
	}
	
	public int delete(int productNo) throws SQLException {
		int rows = 0;
		String sql = "delete from products2 where product_no=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, productNo);
		rows = pstmt.executeUpdate();
		pstmt.close();
		return rows;
	}

}
