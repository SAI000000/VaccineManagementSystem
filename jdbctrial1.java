package com.vaccine.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class jdbctrial1 {
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static String user = "system";
	private static String pass = "root";
	
		int b=0;
		public int insertIntoDB(ArrayList al) {
			String insert ;

			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			

			
			try {

			Class.forName (driver);

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connection estabilished.....");
			System.out.println(al);
			st = con.createStatement();

			insert = "INSERT into project1 VALUES (pro1.nextval,?,?,?,?,?,?,?)";

			
			
			ps1 = con.prepareStatement(insert);
			
			ps1.setString(1, (String) al.get(0));

			ps1.setString(2, (String) al.get(1));

			ps1.setString(3, (String) al.get(2));
			
			ps1.setString(4, (String) al.get(3));

			ps1.setString(5, (String) al.get(4));

			ps1.setString(6, (String) al.get(5));

			ps1.setString(7, (String) al.get(6));

			//ps1.setString(8, (String) al.get(7));
			
			//ps1.setString(9, (String) al.get(8));
			
			//ps1.setString(10, (String) al.get(9));

			b=ps1.executeUpdate();
			
			System.out.println("inserted values");

			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block

			e1.printStackTrace();

			} catch (SQLException i) {

			// TODO Auto-generated catch block

			i.printStackTrace();

			} catch (Exception u) {

			u.printStackTrace();

			}
			System.out.println("Registration Hogaya");
			return b;
			

		}
//}
		public int login ( String id , String pass )
		{
			  String driver = "oracle.jdbc.driver.OracleDriver";
			  String url = "jdbc:oracle:thin:@localhost:1521:XE";
			  String user = "system";
			  String passw = "root";
			Connection con = null;
			Statement st = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String password = null;
			String firstname = null;
			int b = 0;
			String select = null;
			
			try {
				
				Class.forName(driver);
				con = DriverManager.getConnection(url , user , passw);
				System.out.println("login page connection successful");
				st = con.createStatement();
				
			select = "select id, fnm from project1 where eml = ? and cppass= ?";
			System.out.println("select query");
				
				ps = con.prepareStatement(select);
				System.out.println(select);
				ps.setString(1, id);
				ps.setString(2, pass);
				System.out.println("setString");
				rs = ps.executeQuery();
			
				System.out.println("Passed");
				
				while(rs.next()) 
				{
					password = rs.getString(1);
					
					firstname = rs.getString(2);
				System.out.println(" "+id +" "+pass);
					
					JOptionPane.showMessageDialog(null, "Welcome "+firstname);
					
				}
				if(password.equals(pass)) {
					JOptionPane.showMessageDialog(null,"your id is : "+password);
					
				}
				else {
					
					b = 2;
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException i) {
				// TODO Auto-generated catch block
				i.printStackTrace();
			} catch (Exception u) {
				u.printStackTrace();
			} 
			return b;
		}
	
			}
