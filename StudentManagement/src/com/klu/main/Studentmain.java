package com.klu.main;



import java.sql.SQLException;
import java.util.Scanner;

import com.klu.Bean.StudentBean;
import com.klu.insert.*;


public class Studentmain {
	public static void main(String[] args )throws ClassNotFoundException,SQLException{
		StudentBean sb=new StudentBean();
		 Scanner scan = new Scanner(System.in);
		 while(true) {
		 System.out.print("Interactive database:\n 1.Insert a student\n 2.Update a student \n 3.Delete a student \n 4.Display a student");
		 System.out.print("\nselect any option: ");
		 int num = scan.nextInt();
		switch (num) {
		  case 1:
			  System.out.print("enter new registerno: ");
			  int regno= scan.nextInt();
			  System.out.print("enter name of student: ");
			  String name= scan.next();
			  System.out.print("enter branch of student:");
			  String email= scan.next();
			  sb.setRegno(regno);
				sb.setName(name);
				sb.setBranch(email);
				
				StudentInsert si= new StudentInsert();
				int i= si.StudentInsert(sb);
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
			  System.out.print("enter existed registerno: ");
		  int regno1= scan.nextInt();
		  System.out.print("enter new name of student: ");
		  String name1= scan.next();
		  System.out.print("enter new branch of student:");
		  String email1= scan.next();
		  sb.setRegno(regno1);
			sb.setName(name1);
			sb.setBranch(email1);
			
			StudentUpdate su= new StudentUpdate();
			int j= su.StudentUpdate(sb);
			if(j>0) {
				System.out.println("update successful");
				System.out.println("-----------------------------------------------");
				break;
			}
			else {
				System.out.println("fail");
				System.out.println("-----------------------------------------------");
				break;
			}
		  case 3:
			  System.out.print("enter existed registerno: ");
			  int regno2= scan.nextInt();
			 
			  sb.setRegno(regno2);
				
				
				StudentDelete sd= new StudentDelete();
				int k= sd.StudentDelete(sb);
				if(k>0) {
					System.out.println("delete successful");
					System.out.println("-----------------------------------------------");
					break;
				}
				else {
					System.out.println("fail");
					System.out.println("-----------------------------------------------");
					break;
				}
		  case 4:
			  System.out.print("enter existed registerno: ");
		     int regno3= scan.nextInt();
		  sb.setRegno(regno3);
			StudentDisplay sdi= new StudentDisplay();
			int l= sdi.StudentDisplay(sb);
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
		  
		}
		 }
		
	}

}
