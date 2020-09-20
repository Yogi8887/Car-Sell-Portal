package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bo.Login;
import Bo.user_Login;

public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<user_Login> list=new ArrayList<user_Login>();
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
			String sql="select * from user_login_carProject";
			rs  = stmt.executeQuery(sql);
			while(rs.next()){
				int id  = rs.getInt("id");
				String name = rs.getString("name");
				String loginID = rs.getString("login_id");
				String loginPass = rs.getString("login_password");
				
				user_Login loginOb=new user_Login();
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
		request.getRequestDispatcher("User_login_form.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
