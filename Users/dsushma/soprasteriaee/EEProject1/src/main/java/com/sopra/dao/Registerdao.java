package com.sopra.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbcconnection.JDBCConnection;
import com.sopra.beans.Registration;

public class Registerdao {
	public boolean insert(Registration reg) {
		try {
			String sql="insert into registration value(?,?,?)";
			PreparedStatement st=JDBCConnection.getconnect().prepareStatement(sql);
			st.setString(1, reg.getUsername());
			st.setString(2, reg.getPassword());
			st.setString(3, reg.getEmail());
			return st.executeUpdate()>0;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean delete(String username) {
		String Query = "delete from registration where username=?";
		try {
			PreparedStatement st=JDBCConnection.getconnect().prepareStatement(Query);
			st.setString(1,username);
			return st.executeUpdate()>0;
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		return false;
	}
	public Registration getuser(String username) {
		String Query="select * from registeration where username=?";
		Registration user=null;
		try {
			PreparedStatement st=JDBCConnection.getconnect().prepareStatement(Query);
			st.setString(1,username);
			ResultSet res=st.executeQuery();
			while(res.next()) {
				user=new Registration(username,res.getString(2),res.getString(3));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	public List<Registration> getUsers(){
		String query="select * from registration";
		List<Registration> list=new ArrayList<>();
		Registration user=null;
		try {
			PreparedStatement st=JDBCConnection.getconnect().prepareStatement(query);
			ResultSet res=st.executeQuery();
			while(res.next()) {
				String username=res.getString("username");
				String password=res.getString("password");
				String email=res.getString("email");
				user=new Registration(username,password,email);
				list.add(user);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	public Registration getUser(String user) {
		String sql="select * from registration where username=?";
		Registration reg=null;
		try {
			PreparedStatement st=JDBCConnection.getconnect().prepareStatement(sql);
			st.setString(1, user);
			ResultSet res=st.executeQuery();
			while(res.next()) {
				String username=res.getString("username");
				String password=res.getString("password");
				String email=res.getString("email");
				reg=new Registration(username,password,email);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return reg;
	}
}
