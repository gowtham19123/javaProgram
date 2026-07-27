package Task;

public class Con_ov {

	int P_id;
	String P_name;
	float P_price;
	Con_ov(){
		System.out.println("Default Constructor , With no parameter");
	}
	Con_ov(String P_name){
		this.P_name = P_name ;
	}
	Con_ov(int P_id,String P_name,float P_price){
		this.P_id = P_id;
		this.P_name = P_name ;
		this.P_price = P_price;
		
	}
	void display() {
		System.out.println("Product ID = "+P_id);
		System.out.println("Product Name = "+P_name);
		System.out.println("Product price = "+P_price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Con_ov obj = new Con_ov();
        obj.display();
        Con_ov obj1 = new Con_ov("Keyboard");
        obj.display();
        Con_ov obj2 = new Con_ov(01,"Keyboard",850);
        obj.display();
        
	}

}
