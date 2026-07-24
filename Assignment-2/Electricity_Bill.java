import java.util.*;

public class Electricity_Bill{

public static void main(String[] args){

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a total units");
         float units = sc.nextIFloat();
         double charge = units * 8.50;
         double e_tax = charge * 0.05;
         double final_bill = charge + 150 + e_tax; 
         System.out.println("Final_Electricity_Bill ="+final_bill);    
}
}
