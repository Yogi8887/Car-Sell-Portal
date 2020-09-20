package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bo.Login;

public class adminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Login> list=new ArrayList<Login>();
		Connection con = null;
		Statement stmt  = null;
		ResultSet rs  = null;
		String DRIVER_CLASS="oracle.jdbc.driver.OracleDriver"; 
		String URL="jdbc:oracle:thin:@localhost:1521:XE"; 
		String USER="system"; 
		String PASSWORD="sameer54"; 

		try{
			Class.forName(DRIVER_CLASS);
			con  = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt  = con.createStatement();
			String sql="select * from login_table_carProject";
			rs  = stmt.executeQuery(sql);
			while(rs.next()){
				int id  = rs.getInt("id");
				String name = rs.getString("name");
				String loginID = rs.getString("login_id");
				String loginPass = rs.getString("login_password");
				
				Login loginOb=new Login();
				loginOb.setId(id);
				loginOb.setName(name);
				loginOb.setLogin_id(loginID);
				loginOb.setLogin_pass(loginPass);
				list.add(loginOb);
			}
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
		}
		request.setAttribute("loginList",list);
		request.getRequestDispatcher("admin_login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1=request.getParameter("id");
		String str2=request.getParameter("pasword");
		Connection con = null;
		PreparedStatement pstmt  = null;
		ResultSet rs  = null;
		String DRIVER_CLASS="oracle.jdbc.driver.OracleDriver"; 
		String URL="jdbc:oracle:thin:@localhost:1521:XE"; 
		String USER="system"; 
		String PASSWORD="sameer54"; 
		try{
			Class.forName(DRIVER_CLASS);
			con  = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql="select * from login_table_carProject where login_id=? and login_password=?";
			pstmt  = con.prepareStatement(sql);
			pstmt.setString(1,str1);
			pstmt.setString(2,str2);
			rs  = pstmt.executeQuery();
			if(rs.next()){
				int id  = rs.getInt("id");
				String name = rs.getString("name");
				String loginID = rs.getString("login_id");
				String loginPass = rs.getString("login_password");
				
				Login login=new Login();
				login.setId(id);
				login.setName(name);
				login.setLogin_id(loginID);
				login.setLogin_pass(loginPass);
				
				request.setAttribute("loginObj",login);
				request.getRequestDispatcher("Admin_Home.jsp").forward(request, response);
				
			}else{
				request.getRequestDispatcher("Wrong_login.jsp").forward(request, response);
			}
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
		}
		
	}

}
