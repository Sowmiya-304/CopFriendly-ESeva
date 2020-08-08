package com.CopFriendly.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.CopFriendly.model.LoginModel;

public class LoginDao {
	public String CheckLogin(LoginModel loginmodel)
	{ 
		
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sowmiya","root","Sowmi@304");
	       boolean central=false,medical=false,cop=false;
	       
	       System.out.println(loginmodel.getUsername()+" "+loginmodel.getPassword());
	       
	       //System.out.println(loginmodel.getUsername().substring(0, 7));
	       
	        if(loginmodel.getUsername().substring(0, 7).equals("central"))
	       { 
			String query="select * from Central_Login where username=? and password=?";
	        PreparedStatement pstmt=con.prepareStatement(query);
	        pstmt.setString(1,loginmodel.getUsername());
			pstmt.setString(2, loginmodel.getPassword());
	        ResultSet rs=pstmt.executeQuery();
		 central=false;

			 if(rs.next()){
	             central=true;
	         }
	         else{
	             central=false;
	         }
	       }
	      // System.out.println(loginmodel.getUsername()+" "+loginmodel.getPassword());
	        else if(loginmodel.getUsername().substring(0, 7).equals("medical"))
	       { 

			String query="select * from Medical_Login where username=? and password=?";
	        PreparedStatement pstmt=con.prepareStatement(query);
	        pstmt.setString(1,loginmodel.getUsername());
			pstmt.setString(2, loginmodel.getPassword());
	        ResultSet rs=pstmt.executeQuery();
		 medical=false;
		 	if(rs.next()){		
	             medical=true;
	         }
	         else{
	             medical=false;
	         }
	       }
	       
	        else //if(!(loginmodel.getUsername().substring(0, 7).equals("medical"))&&(!(loginmodel.getUsername().substring(0, 7).equals("central"))))
	        {
	        	System.out.println("hi");
	        	String query="select * from Cop_Login where username=? and password=?";
		        PreparedStatement pstmt=con.prepareStatement(query);
		        pstmt.setString(1,loginmodel.getUsername());
				pstmt.setString(2, loginmodel.getPassword());
		        ResultSet rs=pstmt.executeQuery();
			 cop=false;
			 	if(rs.next()){		
		             cop=true;
		         }
		         else{
		             cop=false;
		         }
		     }
	        
			
	     
         con.setAutoCommit(true);
         con.close();

         if(central){
        	 System.out.println("1"+loginmodel.getUsername());
             return "Success_Central";
         }
         else if(medical)
         { System.out.println("1"+loginmodel.getUsername());
             return "Success_Medical";
         }
         else if(cop)
         { System.out.println("1"+loginmodel.getUsername());
        	 return "Success_Cop";
         }
         else
        	 return "failed";
 
}
		
 catch(Exception ex){
      return  "Exception------------------------>  "+ex;
 }
		
}
}
