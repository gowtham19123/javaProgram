package com.java.basics;

import java.util.*;
public class withdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int pin = 1234;
         double balance= 5000;
         System.out.println("Enter a withdraw Amount:");
         double w_Amount = sc.nextInt();
         double A_balance = balance - w_Amount;
    if(pin == 1234 ) {
         if( w_Amount <= balance)
         {
        	 System.out.println("Get your amount");
         }
         else
         {
        	 System.out.println(" you have a less Balance:");
         }
	}
         else {
        	 System.out.println("Enter a Correct pin");
         }
         System.out.println("Balance:"+A_balance);
	}

}