package Task;

class student {
	int reg_no;
	String name;
	static  String collage_name = "Tech Engineering Collage";


student(int reg_no,String name){
	this.reg_no = reg_no;
	this.name = name;
}

void display() {
	System.out.println("Reg.no"+reg_no+"\n"+"Name :"+name+"\n"+"Collage Name :"+collage_name);
}
}

public class static_variable {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        student obj1 = new student(248,"Sam");
        obj1.display();
        student obj2 = new student(343,"Bob");
        obj2.display();
        
	}

}
