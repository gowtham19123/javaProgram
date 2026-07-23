package com.java.basics;

import java.util.*;
public class Cash_withdrawal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
         
        System.out.println("Enter a PIN:");
        int PIN = sc.nextInt();
        
        System.out.println("Enter a Withdraw Amount:");
        
        int Withdraw = sc.nextInt();
       
        int current_B = 50000;
        
        if(PIN == 1234) {
        	if(Withdraw % 100 == 0){
        	
        
        	if( Withdraw < current_B) {
        		System.out.println("Get your Cash");
        }
        	else {
        		System.out.println("Insufficient Balance");
        	}
        }
        	else {
        		System.out.println("Error : Withdraw Amount  is not Multiple by 100 ");
        	}
        }
        else {
        	System.out.println("Invalid PIN");
        }
	}

}
