package com.java.infinite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user=request.getParameter("userName");
		String pwd = request.getParameter("passWord");
		String firstName="", lastName="";
		if(user.equals("Ananya")&&pwd.equals("Ananya")) {
			firstName = "Ananyaa";
			lastName = "Routray";
		}
		if(user.equals("Khafia")&&pwd.equals("Khafia")) {
			firstName="Khafiaa";
			lastName="Ayyub";
		}
		if(user.equals("Pramita")&&pwd.equals("Pramita")) {
			firstName="Pramita";
			lastName="Dash";
		}
		out.print("<a href='WelcomeServlet?firstName="
		+firstName+"&lastName="+lastName+"'>Welcome</a>");
	}

}
