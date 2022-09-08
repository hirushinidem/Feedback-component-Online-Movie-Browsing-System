package com.feedback;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.ResultSetMetaData;


public class FeedbackDBU {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean isSuccess;
	
	
	//adding the feedback
	public static boolean insertFeedback(String id,String username, String movieName, String movieRating, String siteRating, String feedbackcol) {
		
		isSuccess = false;
		
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "INSERT INTO feedback VALUES (0,'"+username+"', '"+movieName+"', '"+movieRating+"','"+siteRating+"', '"+feedbackcol+"')";
			
			int result = stmt.executeUpdate(sql);
			
			if (result > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	//show feedback
	public static List<Feedback> showFeedback(String username){
		
		ArrayList<Feedback> fb = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * from feedback where username = '"+username+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
						System.out.print(" ");
						int id = rs.getInt(1);
						String uname = rs.getString(2);
						String movieName = rs.getString(3);
						int movieRating = rs.getInt(4);
						int siteRating = rs.getInt(5);
						String feedbackcol = rs.getString(6);
						
						Feedback f = new Feedback (id, uname, movieName, movieRating, siteRating, feedbackcol );
						fb.add(f);
								String columnValue = rs.getString(3);
								System.out.print(columnValue);
								
				  System.out.println("");
			}
			
			System.out.print(fb);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return fb;
	}
	
	//update feedback
	public static boolean updatefeedback (String id,String username, String movieName, String movieRating, String siteRating, String feedbackcol) {
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "UPDATE feedback SET movieName = '"+movieName+"', movieRating= '"+movieRating+"', siteRating = '"+siteRating+"', "
					+ "feedbackcol = '"+feedbackcol+"' where id='"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if ( rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//retrieve updated feedback
	public static List<Feedback> getFeedbackDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Feedback> feedback = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM feedback where id='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String uname = rs.getString(2);
				String movieName = rs.getString(3);
				int movieRating = rs.getInt(4);
				int siteRating = rs.getInt(5);
				String feedbackcol = rs.getString(6);
				
				Feedback f = new Feedback (id, uname, movieName, movieRating, siteRating, feedbackcol );
				feedback.add(f);
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return feedback;
	}
	
	//delete relavent feedback
	public static boolean deleteFeedback (String Id) {
		
		int convertedID = Integer.parseInt(Id);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "DELETE FROM feedback where id='"+convertedID+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r > 0) {
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
}
