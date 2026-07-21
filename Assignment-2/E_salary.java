import java.util.*;

public class E_salary{

public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
     System.out.println("enter a Basic salary");
     int b_salary = sc.nextInt();
     double HRA = b_salary * 0.20;
     double  DA = b_salary * 0.10;
     double Gross_salary = b_salary + HRA + DA ;
     System.out.println("Gross salary ="+Gross_salary);
     double PF = b_salary * 0.05;
     double net_salary = Gross_salary - PF;
     System.out.println("Net Salary = "+net_salary);
}
}