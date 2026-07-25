package com.java.basics;

import java.util.Scanner;

public class duplicate_first_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        
        int temp = num;
        int rev = 0;
        while(temp >0) {
        	int digit = temp %10;
        		rev = rev * 10 + digit;
        	temp /= 10;
        }
        
        int duplicate = -1;
        
        int outertemp = rev;
        
        boolean found = false;
        
        while(outertemp >0) {
        	
        	int O_digit = outertemp % 10;
        	
        	
        	int innertemp = outertemp / 10;
        	while (innertemp > 0) {
        		int I_digit = innertemp % 10;
        		
        		if( I_digit== O_digit) {
        			duplicate = I_digit;
        			found = true;
        			break;
        		}
        		innertemp  = innertemp / 10; 
        	}	
        	
        	if(found) {
        		break;
        	}
        	outertemp = outertemp /10;
        }
        
        
        
        
        if(found) {
        	System.out.println("Duplicate Found:"+duplicate);
        }
        else {
        	System.out.println("No Duplicate Found ");
        }
        sc.close();
	}

}
