package Task;

public class En_Bank {
    
	private long BankAc;
	
	private double balance;
	
	private double withdraw;
	
public void setAcno(long newBankAc) {
	
	this.BankAc = newBankAc; 
	
}
public void setbalance(double newbalance) {
	this.balance = newbalance;
}
public void setwithdraw(double newwithdraw) {
	this.withdraw = newwithdraw;
}
public long getAcno() {
	
	return BankAc;
}
public double getbalance() {
	
	return balance;
}
public double getwithdraw() {

		return withdraw;	
	
}

public double calculate_Balance() {
	if(balance >= withdraw) {
		return balance - withdraw;
	}
	else {
		System.out.println("Insufficient Balance ");
		return balance;
	}
}
public void display() {
	System.out.println("Account No: "+BankAc);
	System.out.println(" Balance: "+balance);
	System.out.println("TO Withdraw Amount: "+withdraw);
	System.out.println("Current Balance: "+calculate_Balance());
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      En_Bank obj =new En_Bank();
      obj.setAcno(45635677L);
      obj.setbalance(500000);
      obj.setwithdraw(234650);
      
  
      obj.display();
	}

}
