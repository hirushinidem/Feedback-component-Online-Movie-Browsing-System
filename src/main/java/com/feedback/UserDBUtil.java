package com.feedback;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.feedback.DBConnect;

public class UserDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean isSuccess;

	//validate method
	public static boolean validate(String username, String password, String userType){
			
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from registration where UserName='"+username+"' and Password ='"+password+"' and  Type ='"+userType+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isSuccess;
		
	}
	
	

	//session
	public static User getSessionDetails (String username, String password, String userType) {
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from registration where UserName='"+username+"' and Password='"+password+"' and Type = '"+userType+"' ";
			rs = stmt.executeQuery(sql);
			
			rs.next();
				int id = rs.getInt(1);
				String name= rs.getString(2);
				String userU = rs.getString(3);
				String email = rs.getString(4);
				String phone = rs.getString(5);
				String type = rs.getString(6);
				String passU = rs.getString(7);
				
				//User u = new User (type, id, name, userU, email, phone,passU);
				User u = new User (id, name, userU, email, phone, type, passU);
			
				System.out.println(id);
				System.out.println(name);
				System.out.println(userU);
				System.out.println(email);
				System.out.println(phone);
				System.out.println(type);
				System.out.println(passU +"\n");
				return u;
				
		}
			
		catch( Exception e){
			e.printStackTrace();
		}
	 return null;
	}
	
	
	
	//update
	public static boolean updateuser(String id, String name, String email, String phone, String username, String password ) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update registration set Name= '"+name+"', Email = '"+email+"', TPnumber = '"+phone+"', UserName='"+username+"', Password ='"+password+"'"
							+ "where RegID = '"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
			System.out.println(id);
			System.out.println(name);
			System.out.println(email);
			System.out.println(phone);
			System.out.println(username);
			System.out.println(password);
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	//get user details
		public static List<User> getUserDetails(String Id){
			
			int convertedID = Integer.parseInt(Id);
			
			ArrayList<User> user = new ArrayList<>();
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = " select * from registration where RegID= '"+convertedID+"'";
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					int id = rs.getInt(1);
					String name= rs.getString(2);
					String userU = rs.getString(3);
					String email = rs.getString(4);
					String phone = rs.getString(5);
					String type = rs.getString(6);
					String passU = rs.getString(7);
					
					//User u = new User (type, id, name, userU, email, phone,passU);
					User u = new User (id, name, userU, email, phone, type, passU);
					user.add(u);
					System.out.println(u);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			return user;
		}
	
		//delete user
		public static boolean deleteUser(String id) {
			
			int convertedID = Integer.parseInt(id);
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "delete from registration where RegID='"+convertedID+"'";
				int r = stmt.executeUpdate(sql);
				
				if ( r > 0) {
					isSuccess = true;
				}
				else {
					isSuccess = false;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			return isSuccess;
		}

}

