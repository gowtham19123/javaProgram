import java.util.*;

public class Student_per{

public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       System.out.println("English Mark :"); 
       float E = sc.nextInt();
       System.out.println("Tamil Mark :"); 
       float T = sc.nextInt();
       System.out.println("Maths Mark :"); 
       float M = sc.nextInt();
       System.out.println("Science Mark :"); 
       float Science = sc.nextInt();
       System.out.println("Social Mark :"); 
       float Social = sc.nextInt();
       float total_mark = E + T + M + Science + Social;
       System.out.println("Total_Mark = " +total_mark);
       float avg = total_mark / 5;
       System.out.println("Average = " + avg);
       float percentage = total_mark / 500 *100;
       System.out.println("Percentage = " +percentage);     
      
}
}