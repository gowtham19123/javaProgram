package Task;


abstract class Employee{
	
	int id;
	String name;
	double salary;
	
	Employee(int id,String name){
		this.id = id;
		this.name = name;
	}
	abstract void display();
}

class parttime extends Employee{
	
	parttime(int id,String name,double salary){
		super(id,name);
		this.salary = salary;		
	}
	void display() {
		System.out.println("ID:"+id+"\nName:"+name+"\nPART TIME SALARY:"+salary/2);
	}
}

class fulltime extends Employee{
	
	fulltime(int id,String name,double salary){
		super(id,name);
		this.salary = salary;		
	}
	void display() {
		System.out.println("ID:"+id+"\nName:"+name+"\nFULL TIME SALARY:"+salary);
	}
}

public class Ab_contract_employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee obj1 = new parttime(3245,"Kumar",22000);
        
        obj1.display();
        Employee obj2 = new fulltime(2944,"Suriya",22000);
        
        obj2.display();
	}

}
