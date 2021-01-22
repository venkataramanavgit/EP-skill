package com.klu.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.klu.Bean.StudentBean;
import com.klu.connections.DBUtil;

public class StudentDisplay {

	public int StudentDisplay(StudentBean student) throws ClassNotFoundException,SQLException{
		Connection con3=DBUtil.DBConnection();
		PreparedStatement ps_display=con3.prepareStatement("select * from Student where regno=?");
		ps_display.setInt(1,student.getRegno());
		ResultSet rst =  ps_display.executeQuery();
        System.out.println("Regno\t\tName\tbranch");
        while(rst.next()) {
           System.out.print(rst.getInt(1));
           System.out.print("\t"+rst.getString(2));
           System.out.print("\t"+rst.getString(3));
           System.out.println();
        }
        
		con3.close();
		return 1;
		}
	
}
