package Task;

class payment1{
	void payment_method() {
		System.out.println("Parent class Method");
	}
}
class credit_card extends payment1{
	void payment_method() {
		System.out.println("Credit Card Method");
	}
}
class UPI extends payment1{
	void payment_method() {
		System.out.println("UPI Method");
	}
}
class NetBanking extends payment1{
	void payment_method() {
		System.out.println("NetBanking Method");
	}
}
class Wallet extends payment1{
	void payment_method() {
		System.out.println("Wallet Method");
	}
}
public class Overriding_payments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            payment1 obj1 = new credit_card();
            obj1.payment_method();
            
            payment1 obj2 = new UPI();
            obj2.payment_method();
            
            payment1 obj3 = new Wallet();
            obj3.payment_method();
	}

}
