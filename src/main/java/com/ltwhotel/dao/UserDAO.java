package com.ltwhotel.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ltwhotel.entity.User;


public class UserDAO extends DAO {
	public UserDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean checkLogin(User user) {
		boolean result = false;
		String sql = "SELECT * FROM tblUser WHERE username = ? AND password = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				user.setId(rs.getInt("id"));
				result = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
