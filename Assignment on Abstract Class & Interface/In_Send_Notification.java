package Task;

interface Notification{
	void SendNotification();
}
class EmailNotification implements Notification{
	public void SendNotification() {
		System.out.println(" Email Notification");
	}
}
class SMSNotification implements Notification{
	public void SendNotification() {
		System.out.println(" SMS Notification");
	}
}
class WhatsAppNotification implements Notification{
	public void SendNotification() {
		System.out.println(" WhatsApp Notification");
	}
}

public class In_Send_Notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Notification obj1 = new EmailNotification();
        obj1.SendNotification();
        
        Notification obj2 = new SMSNotification();
        obj2.SendNotification();
        
        Notification obj3 = new WhatsAppNotification();
        obj3.SendNotification();
	}

}
