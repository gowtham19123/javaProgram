package Task;

public class Bank_Account {
    
	int account_no;
	float balance ;

	
	Bank_Account(int account_no,float balance) {
		this.account_no = account_no;
		this.balance = balance;
	}
	void display() {
		System.out.println("Account no ="+account_no);
		System.out.println("Account balance ="+balance);
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Bank_Account obj = new Bank_Account(879376291,50000);
          obj.display();
          Bank_Account obj1 = new Bank_Account(939383734,80000);
          obj1.display();
          Bank_Account obj3 = new Bank_Account(189364746,30000);
          obj3.display();
        		  
	}

}
