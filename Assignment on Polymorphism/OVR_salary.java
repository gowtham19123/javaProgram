package Task;


class salary_cal{
	void CalculateSalary(int salary) {
		System.out.println("TO Calculate Salary for Employees ");
	}
}
class Full_time extends salary_cal{
	void CalculateSalary(int salary) {
		System.out.println("Full Time Salary : "+salary);
	}
}
class Part_time extends salary_cal{
	void CalculateSalary(int salary) {
		System.out.println("Part Time Salary : "+salary);
	}
}
class Contract extends salary_cal{
	void CalculateSalary(int salary) {
		System.out.println("Contract Salary : "+salary);
	}
}
public class OVR_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      salary_cal obj1 = new Full_time();     
      obj1.CalculateSalary(35000);
      
      salary_cal obj2 = new Part_time();     
      obj2.CalculateSalary(15000);
      
      salary_cal obj3 = new Contract();     
      obj3.CalculateSalary(22000);
      
	}

}
