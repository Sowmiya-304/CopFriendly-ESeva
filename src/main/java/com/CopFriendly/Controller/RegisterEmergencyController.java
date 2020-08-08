package com.CopFriendly.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CopFriendly.Dao.RegisterEmergencyDao;
import com.CopFriendly.model.RegisterEmergencyModel;

public class RegisterEmergencyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
	    
		String location=request.getParameter("location");
		int type_of_emergency_choice=Integer.parseInt(request.getParameter("type_of_emergency"));
		int priority_choice=Integer.parseInt(request.getParameter("priority"));
		int no_of_people=Integer.parseInt(request.getParameter("no_of_people"));
		
		String type_of_emergency="";
		String priority="";
		if(type_of_emergency_choice==1)
				type_of_emergency="Accident";
		else
				type_of_emergency="Medical Care";
		
		if(priority_choice==1)
				priority="Critical";
		else if(priority_choice==2)
				priority="High";
		else if(priority_choice==3)
				priority="Medium";
		else
				priority="Low";
			
		
		RegisterEmergencyDao registeremergencydao=new RegisterEmergencyDao(); 
		RegisterEmergencyModel registeremergencymodel=new RegisterEmergencyModel();
		
		
		registeremergencymodel.setLocation(location);
		registeremergencymodel.setType_of_emergency(type_of_emergency);
		registeremergencymodel.setPriority(priority);
		registeremergencymodel.setNo_of_people(no_of_people);
		
		String result=registeremergencydao.RegisterEmergency(registeremergencymodel);

		
		
	}

}
