package com.java.basics;

import java.util.*;
public class Sum_E_O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number :");
         int num = sc.nextInt();
         
         int E_sum  = 0;
         int  O_sum  = 0;
         
         int temp = num; 
         
         while(temp >0){
        	 
        	 int digit = temp % 10;
        	 if(digit % 2== 0) {
            	 
            	E_sum +=digit; 
             }
        	 else  {
        		 O_sum += digit;
        	 }
        	 
        	 temp = temp/ 10;
         }
        	 System.out.println("Even Sum ="+E_sum);
             System.out.println("OOD Sum ="+O_sum);
        
         
         
         
        
      
         

}
}