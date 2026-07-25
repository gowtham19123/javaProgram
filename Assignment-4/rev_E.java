package com.java.basics;

import java.util.Scanner;

public class rev_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        
        int temp = num;
        int rev = 0;
        while(temp >0) {
        	int digit = temp %10;
        	if(digit % 2 ==0) {
        		rev = rev * 10 + digit;
        	}
        		
        	temp /= 10;
        }
        System.out.println(rev);
        

        sc.close();
	}

}
