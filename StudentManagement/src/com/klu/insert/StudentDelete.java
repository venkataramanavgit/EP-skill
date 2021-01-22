package com.klu.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.klu.Bean.StudentBean;
import com.klu.connections.DBUtil;

public class StudentDelete {

	public int StudentDelete(StudentBean student) throws ClassNotFoundException,SQLException{
		Connection con2=DBUtil.DBConnection();
		PreparedStatement ps_delete=con2.prepareStatement("delete from Student where regno=?");
		ps_delete.setInt(1,student.getRegno());
		int i=ps_delete.executeUpdate();
		con2.close();
		return i;
		}

}
