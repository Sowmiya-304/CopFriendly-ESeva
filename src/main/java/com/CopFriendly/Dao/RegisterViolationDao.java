package com.CopFriendly.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.CopFriendly.model.RegisterViolationModel;

public class RegisterViolationDao {
	 public String RegisterViolation(RegisterViolationModel registerviolationmodel){

	        try{

	        	Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sowmiya","root","Sowmi@304");
		        
	                String query="insert into Register_Violation values(?,?,?,?,?,?,?,?,?,?)";
	                PreparedStatement pstmt=con.prepareStatement(query);

	                pstmt.setString(1,registerviolationmodel.getViolators_name());
	                pstmt.setString(2,registerviolationmodel.getDriving_license());
	                pstmt.setString(3,registerviolationmodel.getViolation_type());
	                pstmt.setString(4,registerviolationmodel.getVehicle_type());
	                pstmt.setString(5,registerviolationmodel.getRegistration_number());
	                pstmt.setString(6, registerviolationmodel.getPhone_number());
	                pstmt.setString(7,registerviolationmodel.getColor());
	                pstmt.setString(8,registerviolationmodel.getViolation_date());
	                pstmt.setString(9,registerviolationmodel.getViolation_time());
	                pstmt.setString(10,registerviolationmodel.getLocation());
	               
	                
	                System.out.println(registerviolationmodel.getViolators_name());
	                
	                
	                pstmt.executeUpdate();
	                con.setAutoCommit(true);
	                con.close();
	                return "Inserted Successfully!";
	        }
	        catch(Exception ex){
	             return  "Exception------------------------>  "+ex;
	        }
}
}
