package com.CopFriendly.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.CopFriendly.model.RegisterEmergencyModel;

public class RegisterEmergencyDao {
	 public String RegisterEmergency(RegisterEmergencyModel registeremergencymodel){

	        try{

	        	Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sowmiya","root","Sowmi@304");
		        
	                String query="insert into Register_Emergency values(?,?,?,?)";
	                PreparedStatement pstmt=con.prepareStatement(query);

	                pstmt.setString(1,registeremergencymodel.getLocation());
	                pstmt.setString(2,registeremergencymodel.getType_of_emergency());
	                pstmt.setString(3,registeremergencymodel.getPriority());
	                pstmt.setInt(4,registeremergencymodel.getNo_of_people());
	               
	               
	                
	                System.out.println(registeremergencymodel.getLocation());
	                
	                
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
