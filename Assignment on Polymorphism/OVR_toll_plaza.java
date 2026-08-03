package Task;

class toll{
	void calculates(float price) {
		System.out.println("toll Class");
	}
}
class cars extends toll{
	void calculates(float price) {
		System.out.println("Car toll Price:"+price);
	}
}
class Buses extends toll{
	void calculates(float price) {
		System.out.println("Buses toll Price:"+price);
	}
}
class Trucks extends toll{
	void calculates(float price) {
		System.out.println("Truck toll Price:"+price);
	}
}
class Bikes extends toll{
	@Override
	void calculates(float price) {
		System.out.println("Bike Toll Price"+price);
	}
}
public class OVR_toll_plaza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       toll obj1 = new cars();
       obj1.calculates(40);
       
       toll obj2 = new Buses();
       obj2.calculates(60);
       
       toll obj3 = new Trucks();
       obj3.calculates(120);
       
       toll obj4 = new Bikes();
       obj4.calculates(0);
       
       
	}

}
