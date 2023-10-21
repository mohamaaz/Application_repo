package com.gqt.servletjdbc.model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.gqt.servletjdbc.beans.Library;

public class Model {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
	private Statement stmt;
	
	public Model() {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			
	    	 System.out.println("Database Driver is loaded");
	    	 String url = "jdbc:mysql://localhost:3306/gqt_online";
	    	 String username = "root";
	    	 String pwd = "Maaz@12345";
	    	 con = DriverManager.getConnection(url , username , pwd);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	 public boolean insertData (Library l) {
			try {
				String sql = "insert into Library values(?,?,?,?,?,?)";
				System.out.println("insert working properly");
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, l.getBookid());
				pstmt.setString(2, l.getBookname());
				pstmt.setString(3, l.getAuthor());
				pstmt.setInt(4, l.getYr_publish());
				pstmt.setInt(5, l.getCost());
				pstmt.setString(6, l.getLib_location());
				
				int x = pstmt.executeUpdate();
				if (x>0) {
					return true;
				}
				else {
					return false;
				}
			}
		catch (Exception exep) {
			exep.printStackTrace();
		}
			return false;
}
		public boolean updateData(Library l) {
			try {
				String sql = "update Library set bookname=? where bookid=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(2,l.getBookid());
				pstmt.setString(1, l.getBookname());
				int x = pstmt.executeUpdate();
				if (x>0) {
					return true;
				}
				else {
					return false;
				}
			}
			catch (Exception exep) {
				exep.printStackTrace();
			}
			return false;
		}
		public boolean deleteData(Library l) {
			try {
				String sql = "delete from Library where bookid = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, l.getBookid());
				int x = pstmt.executeUpdate();
				if(x>0) {
					return true;
				}
				else {
					return false;
				}
			}
			catch (Exception e) {
				e.printStackTrace();
				}
			return false;
		}
}