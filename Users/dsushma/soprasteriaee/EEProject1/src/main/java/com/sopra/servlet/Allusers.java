package com.sopra.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sopra.beans.Registration;
import com.sopra.dao.Registerdao;

/**
 * Servlet implementation class Allusers
 */
@WebServlet("/Allusers")
public class Allusers extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Registerdao d=new Registerdao();
		PrintWriter p=response.getWriter();
		List<Registration> users=new ArrayList<>();
		users.addAll(d.getUsers());
		p.println("<table cellspacing='0' width='35px' border='1px'");
		p.println("<tr>");
		p.println("<td>Username</td>");
		p.println("<td>Password</td>");
		p.println("<td>Email</td>");
		p.println("</tr>");
		p.println("/table>");
		for(Registration u:users) {
			p.println("<tr>");
			p.println("<td>"+u.getUsername()+"</td>");
			p.println("<td>"+u.getPassword()+"</td>");
			p.println("<td>"+u.getEmail()+"</td>");
			p.println("<td>"+"<a.href='Delete?username="+u.getUsername()+"'>Delete+</a></td>");
			p.println("<td>"+"<a href=''>Update</a>"+"</td>");
			p.println("<tr>");
		}
		p.println("</table>");
		}
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	