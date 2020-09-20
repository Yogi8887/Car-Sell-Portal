package controller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import javax.servlet.http.Part;

import Bo.Login;
import Bo.Modal;

public class AddModalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Modal> list = new ArrayList<Modal>();
		//fill using jdbc
		Connection con = null;
		Statement stmt  = null;
		ResultSet rs  = null;
		FileReader fr = null;
		String DRIVER_CLASS="oracle.jdbc.driver.OracleDriver"; 
		String URL="jdbc:oracle:thin:@localhost:1521:XE"; 
		String USER="system"; 
		String PASSWORD="sameer54"; 

		try{
			Class.forName(DRIVER_CLASS);
			con  = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt  = con.createStatement();
			String sql="select * from modal_table_carProject";
			rs  = stmt.executeQuery(sql);
			while(rs.next()){
				int id  = rs.getInt("id");
				String brandName = rs.getString("brandName");
				String modal = rs.getString("modal");
				int price = rs.getInt("price");
				int sitting_cap = rs.getInt("sitting_capasity");
				float milage = rs.getFloat("milage");
				
				Modal modalOb=new Modal();
				modalOb.setId(id);
				modalOb.setBrandName(brandName);
				modalOb.setModal(modal);
				modalOb.setPrice(price);
				modalOb.setSiting_cap(sitting_cap);
				modalOb.setMilage(milage);
				list.add(modalOb);
			}
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
		}
		request.setAttribute("ModalList",list);
		request.getRequestDispatcher("Add_Modal.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String brand=request.getParameter("brand");
		String modal=request.getParameter("modal");
		String strprice=request.getParameter("price");
		String milage=request.getParameter("milage");
		String sitNo=request.getParameter("sitNo");
		Part filePart=request.getPart("image");
		InputStream is= null;
		if(filePart!=null){
			long fileSize = filePart.getSize();
			String fileContent=filePart.getContentType();
			is = filePart.getInputStream();
		}int price=Integer.parseInt(strprice);
		float Milage=Float.parseFloat(milage);
		int SitNo=Integer.parseInt(sitNo);
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
			String sql="insert into modal_table_carProject(id,brandName,modal,price,milage,sitting-capasity,image)values(modal_table_carProject_seq.nextval,?,?,?,?,?,?)";
			pstmt  = con.prepareStatement(sql);
			pstmt.setString(1,brand);
			pstmt.setString(2,modal);
			pstmt.setInt(3,price);
			pstmt.setFloat(4,Milage);
			pstmt.setInt(5,SitNo);
			pstmt.setBlob(6,is);
			
			
			if(pstmt.executeUpdate()==1){
				
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
