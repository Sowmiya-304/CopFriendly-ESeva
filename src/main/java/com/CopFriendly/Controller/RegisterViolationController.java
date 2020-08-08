package com.CopFriendly.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CopFriendly.Dao.RegisterViolationDao;
import com.CopFriendly.model.RegisterViolationModel;


public class RegisterViolationController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
	      response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
			String violators_name=request.getParameter("violators_name");
			String driving_license=request.getParameter("driving_license");
			String violation_type=request.getParameter("violation_type");
			String vehicle_type=request.getParameter("vehicle_type");
			String registration_number=request.getParameter("registration_number");
			String phone_number=request.getParameter("phone_number");
			String color=request.getParameter("color");
			String date=request.getParameter("violation_date");
			String time=request.getParameter("violation_time");
			String location=request.getParameter("location");
			
			RegisterViolationDao registerviolationdao=new RegisterViolationDao(); 
			RegisterViolationModel registerviolationmodel=new RegisterViolationModel();
			
			registerviolationmodel.setViolators_name(violators_name);
			registerviolationmodel.setDriving_license(driving_license);
			registerviolationmodel.setViolation_type(violation_type);
			registerviolationmodel.setVehicle_type(vehicle_type);
			registerviolationmodel.setRegistration_number(registration_number);
			registerviolationmodel.setPhone_number(phone_number);
			registerviolationmodel.setColor(color);
			registerviolationmodel.setViolation_date(date);
			registerviolationmodel.setViolation_time(time);
			registerviolationmodel.setLocation(location);
			
			out.println(registerviolationmodel.getColor());
			
			String result=registerviolationdao.RegisterViolation(registerviolationmodel);
			out.println("<h1>"+result+"</h1>");
			
			out.close();
	}

}
