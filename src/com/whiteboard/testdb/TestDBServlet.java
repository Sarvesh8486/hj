package com.whiteboard.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = "springstudent";
		String password = "springstudent";
		String jdbcUrl = "jdbc:mysql://localhost:3309/web_customer_tracker?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		PrintWriter out = response.getWriter();
		try{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			out.println("Connection Successfull...!");
			conn.close();
		}catch(ClassNotFoundException ex){
			out.println("ClassNotFoundEx");
			ex.printStackTrace();
		}catch(SQLException ex){
			out.println("SQLException");
			ex.printStackTrace();
		}catch(Exception ex){
			out.println("Exception");
			ex.printStackTrace();
		}
		
		
	}
}
