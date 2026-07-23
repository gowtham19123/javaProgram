package com.java.basics;

import java.util.Scanner;

public class Scholarship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
		 
		 System.out.println("Enter a Mark");
		 float mark = sc.nextInt();
		 
		 System.out.println("Enter a Attendance Percentage:");
		 float percentage = sc.nextInt();
		 
		 System.out.println("Number of Arrears");
		 float arrear = sc.nextInt();
		 
		 if(mark >= 85) {
			 if(percentage >= 90 ) {
				 if(arrear == 0) {
					 
					 System.out.println("You can get Scholarship");	 
				 }
				 else {
					 System.out.println("You can't get Scholarship");	
				 }
			 }
			 else {
				 System.out.println("Your Percentage is less than 90%");	
			 }
		 }
		 else {
			 System.out.println("Your Mark is less than 85");
		 }
		 

	}

}
