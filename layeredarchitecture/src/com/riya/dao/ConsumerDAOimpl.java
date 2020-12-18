package com.riya.dao;
import java.sql.*;

import com.riya.entities.Consumer;
public class ConsumerDAOimpl implements ConsumerDAO {
	
	public int insert(Consumer c) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int i=0;
		try {
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ose","scott","tiger");
			String sql="Insert into customer_details values(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, c.getId());
			pstmt.setString(2, c.getName());
			pstmt.setString(3, c.getCountry());
			i=pstmt.executeUpdate();
			conn.commit();
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

}
