package com.swiggy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.swiggy.entity.SwiggyModel;

public class SwiggyDao implements swiggyDaoInterface {
	
	@Override
	public int login(SwiggyModel se) {
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");
			PreparedStatement ps=con.prepareStatement("insert into swiggyview values (?,?,?,?)");
			ps.setString(1, se.getName());
			ps.setInt(2, se.getMblnum());
			ps.setString(3,se.getMail());
			ps.setString(4, se.getPwd());
			
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		
		return i;
		

}
}
