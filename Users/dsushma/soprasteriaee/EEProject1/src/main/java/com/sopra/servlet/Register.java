package com.sopra.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sopra.beans.Registration;
import com.sopra.dao.Registerdao;

/**
 * Servlet implementation class Registraion
 */
@WebServlet("/Register")
public class Register extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String email= request.getParameter("email");
		Registration reg=new Registration();
		reg.setUsername(username);
		reg.setPassword(password);
		reg.setEmail(email);
		Registerdao user=new Registerdao();
		//user.insert(reg);
		user.delete(username);
		
	}

	

	

}
