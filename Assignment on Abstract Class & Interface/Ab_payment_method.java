package Task;

import java.util.*;

abstract class  payment {
	
	int amount;
	int trancationid;
	Date payment_date;
	
	
	
	public  payment(int amount,int trancationid){
		
		this.amount = amount;
		this.trancationid = trancationid;
		this.payment_date = new Date();
		
		
	}
	
	void display() {
		System.out.println("Amount: "+amount+"\n"+"Trancationid: "+trancationid+"\n"+"Payment Date: "+payment_date);
	}
	abstract void process_payment();
}

 class upipayment extends payment{
	
	int upi_Id;
	public upipayment(int amount,int trancationid,int upi_Id) {
		super(amount,trancationid);
		this.upi_Id = upi_Id;
	
	}
	void process_payment() {
		System.out.println("UPI Payment");
		System.out.println("Amount: "+amount+"\nTrancationid: "+trancationid+"\nUPI ID:"+upi_Id+"\nPayment Date: "+payment_date);
	}
}
 
class creditcardpayment extends payment{
	String cardNumber;
	public creditcardpayment(int amount,int transcationid,String cardNumber) {
		super(amount,transcationid);
		this.cardNumber = cardNumber;
			
	}	
	   void  process_payment() {
		   
		   System.out.println("\nCredit Card Payment");
			System.out.println("Amount: "+amount+"\n"+"Trancationid: "+trancationid+"\n"+"Credit Card Number:"+cardNumber+"\nPayment Date: "+payment_date);
		}
	
}
public class Ab_payment_method  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		payment obj = new upipayment(40000,78474475,77544678);
		
		payment obj1 = new creditcardpayment(83000,367338863,"23333737378");
		
		obj.process_payment();
		obj1.process_payment();
	}

}
