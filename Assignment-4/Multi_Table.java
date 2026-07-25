package com.java.basics;

import java.util.*;
public class Multi_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Multipilication Table Number :");
         int num = sc.nextInt();
         
         for(int i=1;i<=10;i++) {
        	 int result = num * i;
        	 System.out.println(num +"x"+i+"="+result);
         }
	}

}
