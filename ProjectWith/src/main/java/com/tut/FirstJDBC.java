package com.tut;
import java.sql.*;
public class FirstJDBC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/cvam1";
			String username="root";
			String password="admin";
			String query="select * from dept";
			Connection con=DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
			String userData=rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getString(3);
			System.out.println(userData);
			}
			st.close();
			con.close();
//			if(con.isClosed()) {
//				System.out.println("connection is closed");
//			}
//			else {
//				System.out.println("connenction crested");
//			}
			
		
	}

}
