package Task;

interface  Switch{
 
      void turnOn();
      void turnoff();
}

class Bulb implements Switch{
	
	public void turnOn() {
		System.out.println("light ON");
	}
	public void turnoff() {
		System.out.println("Light OFF");
	}
}
class fan implements Switch{
	
	public void turnOn() {
		System.out.println("Fan Runing");
	}
	public void turnoff() {
		System.out.println("Fan Not Runing");
	}
}
class AC implements Switch{
	
	public void turnOn() {
		System.out.println("AC Runing");
	}
	public void turnoff() {
		System.out.println("AC Not Runing");
	}
}
public class In_Smart_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Switch obj = new Bulb();
         obj.turnOn();
         
         Switch obj1 = new fan();
         obj.turnoff();
         
         Switch obj2 = new AC();
         obj2.turnOn();
         
         
         
	}

}
