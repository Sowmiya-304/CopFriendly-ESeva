package com.CopFriendly.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CopFriendly.Dao.LoginDao;
import com.CopFriendly.model.LoginModel;


public class LoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		LoginDao logindao=new LoginDao(); 
		LoginModel loginmodel=new LoginModel();
		
		loginmodel.setUsername(username);
		loginmodel.setPassword(password);
		
		String result=logindao.CheckLogin(loginmodel);
		
		if(result.equals("Success_Central"))
		{
			request.setAttribute("username", username);
			request.getRequestDispatcher("Central_Welcome.html").forward(request, response);
		}
		else if(result.equals("Success_Medical")){
			request.setAttribute("username", username);
			request.getRequestDispatcher("Medical_Welcome.html").forward(request, response);
		}
		else if(result.equals("Success_Cop")){
			request.setAttribute("username", username);
			request.getRequestDispatcher("Cop_Welcome.html").forward(request, response);
		}
		else
		{
			request.setAttribute("output","Username or Password you entered is incorrect");
			 request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		
		
	}

}
