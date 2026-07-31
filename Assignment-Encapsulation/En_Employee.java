package Task;

public class En_Employee {
        private float salary;
    public void setSalary(float NewSalary) {
    	if(NewSalary > 0) {
    		this.salary = NewSalary;
    	}
    	else {
    		System.out.println("Invalid Salary");
    	}
    }
    public float getSalary() {
    	return salary;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		En_Employee obj = new En_Employee();
		
		obj.setSalary(35000);
		
		System.out.println("New Employee Salary ="+obj.getSalary());

	}

}
