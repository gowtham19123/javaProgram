package Task;


class notification{
	void send(int code) {
		System.out.println("Send Method");
	}
}
class email extends notification{
	void send(int code) {
		System.out.println("Email notification Client Code:"+code);
	}
}
class SMS extends notification{
	void send(int code) {
		System.out.println("SMS notification Client Code:"+code);
	}
}
class Push extends notification{
	void send(int code) {
		System.out.println("POP-UP notification Client Code:"+code);
	}
}
public class OVR_notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       notification obj1 = new email();
       obj1.send(3456);
       
       notification obj2 = new SMS();
       obj2.send(1234);
       
       notification obj3 = new email();
       obj3.send(7890);
	}

}
