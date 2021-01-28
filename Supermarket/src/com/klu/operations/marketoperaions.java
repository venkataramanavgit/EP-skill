package com.klu.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.klu.connection.DBUtil;

import com.klu.Bean.marketbean;

public class marketoperaions {
	public int marketInsert(marketbean market) throws ClassNotFoundException,SQLException{
		Connection con=DBUtil.DBConnection();
		PreparedStatement ps_insert=con.prepareStatement("insert into Market values(?,?,?)");
		ps_insert.setInt(1,market.getiditem());
		ps_insert.setString(2,market.getnameitem());
		ps_insert.setFloat(3,market.getitem_cost());
		int i=ps_insert.executeUpdate();
		con.close();
		return i;
	}

	public int marketDisplay() throws ClassNotFoundException,SQLException{
		Connection con3=DBUtil.DBConnection();
		PreparedStatement ps_display=con3.prepareStatement("select * from Market");
		
		
		
		ResultSet rst =  ps_display.executeQuery();
        System.out.println("item_id\titem_name\titem_cost");
        while(rst.next()) {
           System.out.print(rst.getInt(1));
           System.out.print("\t"+rst.getString(2));
           System.out.print("\t\t"+rst.getString(3));
           System.out.println();
        }
        
		con3.close();
		return 1;
		}
	public int marketcostDisplay() throws ClassNotFoundException,SQLException{
		Connection con4=DBUtil.DBConnection();
		PreparedStatement ps_costdisplay=con4.prepareStatement("select sum(item_cost) from Market");
		ResultSet rst =  ps_costdisplay.executeQuery();
		rst.next();
		System.out.println("cost of items: "+rst.getFloat("sum(item_cost)"));
        
		con4.close();
		return 1;
		}

}
