package com.hb.crud.hbcrud;

import java.util.Scanner;



public class maincrud {

	public static void main(String[] args) {
		bean sb=new bean();
		 Scanner scan = new Scanner(System.in);
		 while(true) {
		 System.out.print("Interactive hibernate:\n 1.Insert a student\n 2.Update a student \n 3.Delete a student \n 4.Display a student");
		 System.out.print("\nselect any option: ");
		 int num = scan.nextInt();
		switch (num) {
		  case 1:
			  System.out.print("enter new registerno: ");
			  int id= scan.nextInt();
			  System.out.print("enter name of student: ");
			  String name= scan.next();
			  System.out.print("enter email of student:");
			  String email= scan.next();
			  System.out.print("enter dob of student:");
			  String dob= scan.next();
			  System.out.print("enter course of student:");
			  String course= scan.next();
			  sb.setId(id);
				sb.setName(name);
				sb.setEmail(email);
				sb.setDob(dob);
				sb.setCourse(course);
				
				App si= new App();
				si.insert(sb);
				break;
				
				
		  case 2:
			  System.out.print("enter existed registerno: ");
		  int id1= scan.nextInt();
		  System.out.print("enter new name of student: ");
		  String name1= scan.next();
		  System.out.print("enter new email of student:");
		  String email1= scan.next();
		  System.out.print("enter dob of student:");
		  String dob1= scan.next();
		  System.out.print("enter course of student:");
		  String course1= scan.next();
		  sb.setId(id1);
			sb.setName(name1);
			sb.setEmail(email1);
			sb.setDob(dob1);
			sb.setCourse(course1);
			
			App si1= new App();
			si1.update(sb);
			break;
		  case 3:
			  System.out.print("enter existed registerno: ");
			  int regno2= scan.nextInt();
			 
			  sb.setId(regno2);
				
				
			  App si12= new App();
				 si12.delete(sb);
				break;
		  case 4:
			  System.out.print("enter existed registerno: ");
		     int regno3= scan.nextInt();
		  sb.setId(regno3);
		  App si123= new App();
			si123.display(sb);
			break;
			
		 }
		

	}
	}
}


