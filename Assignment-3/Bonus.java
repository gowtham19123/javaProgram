package com.java.basics;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("No of Year's Experience:");
		float experience = sc.nextInt();
		
		System.out.println("Your Rating:");
		float rating = sc.nextInt();
		
		System.out.println("Enter a Attendance Percentage:");
	    float percentage = sc.nextInt();
		
	    if(experience >= 5) {
	    	if(rating >=4) {
	    		if(percentage >= 95) {
	    			System.out.println("Eligible to get Bonus");
	    		}
	    		else {
	    			System.out.println(" Not Eligible to get Bonus");
	    		}
	    	}
	    	else {
	    		System.out.println(" Rating  less than 4 ");
	    	}
	    }
	    else {
	    	System.out.println("Experience less than 5");
	    }
	}

}
