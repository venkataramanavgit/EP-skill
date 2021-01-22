package com.klu.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.klu.Bean.StudentBean;
import com.klu.connections.DBUtil;

public class StudentUpdate {


	public int StudentUpdate(StudentBean student) throws ClassNotFoundException,SQLException{
		Connection con1=DBUtil.DBConnection();
		PreparedStatement ps_update=con1.prepareStatement("update Student set name=?,branch=? where regno=? ");
		ps_update.setString(1,student.getName());
		ps_update.setString(2,student.getBranch());
		ps_update.setInt(3,student.getRegno());
		int i=ps_update.executeUpdate();
		con1.close();
		return i;
		}
}
