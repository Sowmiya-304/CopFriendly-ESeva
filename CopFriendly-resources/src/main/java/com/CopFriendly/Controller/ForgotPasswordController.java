package com.CopFriendly.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CopFriendly.Dao.ForgotPasswordDao;


public class ForgotPasswordController extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
        String to = request.getParameter("mail_id");
        String subject = "hi";
        String message =  "message";
        String user = "sowmiya304@gmail.com";
        String pass = "password here";
        String s=ForgotPasswordDao.send(to,subject, message, user, pass);      
        
	}

}     
