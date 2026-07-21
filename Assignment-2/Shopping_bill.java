import java.util.*;

public class Shopping_bill{

public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Product A Price: ");
      double product_A = sc.nextInt();
      System.out.println("Product B Price: ");
      double product_B = sc.nextInt();
      System.out.println("Product C Price: ");
      double product_C = sc.nextInt();
      double Total_price = product_A + product_B +product_C;
      System.out.println("Total_ammount = "+Total_price);
      double Discount = Total_price * 0.10;
      System.out.println("Discount = "+Discount);
      double GST = Total_price * 0.18;
      System.out.println("GST = "+GST);
      double Payable_ammount = Total_price - Discount + GST;
      System.out.println("Payable_ammount = "+Payable_ammount);
       
      
}
}