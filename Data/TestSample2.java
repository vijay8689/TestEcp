package com.wellsfargo;

import java.sql.*;

public class TestSample2 {
	
	
	public static void main(String ar[]){  
		 try{  
		   //String database="student.mdb";//Here database exists in the current directory  
		  
		  // String url1="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" + database + ";DriverID=22;READONLY=true";  
		  
		   String url="jdbc:ucanaccess://C://Users//Vijay & Sumana//eclipse-workspace//Test//src//com//wellsfargo//student.mdb";
		   Connection c=DriverManager.getConnection(url);  
	   Statement st=c.createStatement();  
		   ResultSet rs=st.executeQuery("select * from login");  
		    
		   while(rs.next()){  
		    System.out.println(rs.getString(1));  
		   }  
		  
		}catch(Exception ee){System.out.println(ee);}  
		  
		}
}
