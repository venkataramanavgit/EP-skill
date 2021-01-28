package com.klu.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.klu.Bean.marketbean;
import com.klu.operations.marketoperaions;

public class marketmain{
public static void main(String[] args )throws ClassNotFoundException,SQLException{
	marketbean sb=new marketbean();
	 Scanner scan = new Scanner(System.in);
	 while(true) {
	 System.out.print("Interactive database:\n 1.Insert a item\n 2.Display all items\n 3.Display total cost");
	 System.out.print("\nselect any option: ");
	 int num = scan.nextInt();
	switch (num) {
	  case 1:
		  System.out.print("enter item_id: ");
		  int iditem= scan.nextInt();
		  System.out.print("enter item_name: ");
		  String nameitem= scan.next();
		  System.out.print("enter item_cost:");
		  float item_cost= scan.nextFloat();
		  sb.setiditem(iditem);
			sb.setnameitem(nameitem);
			sb.setitem_cost(item_cost);
			
			marketoperaions si= new marketoperaions();
			int i= si.marketInsert(sb);
			if(i>0) {
				System.out.println("insertion successful");
				System.out.println("-----------------------------------------------");
				break;
			}
			else {
				System.out.println("fail");
				System.out.println("-----------------------------------------------");
				break;
			}
	  case 2:
		 
	   
		  marketoperaions sdi= new marketoperaions();
		int l= sdi.marketDisplay();
		if(l>0) {
			System.out.println("display successful");
			System.out.println("-----------------------------------------------");
			break;
		}
		else {
			System.out.println("fail");
			System.out.println("-----------------------------------------------");
			break;
		}
		
	  case 3:
	 
			 
		   
		  marketoperaions sdj= new marketoperaions();
		int m= sdj.marketcostDisplay();
		if(m>0) {
			System.out.println("total cost display successful");
			System.out.println("-----------------------------------------------");
			break;
		}
		else {
			System.out.println("fail to display");
			System.out.println("-----------------------------------------------");
			break;
		}
	  
	}
	 }
}
}
	
