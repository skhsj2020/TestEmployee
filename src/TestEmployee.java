import java.util.Scanner;
public class TestEmployee {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Employee e =  new Employee();
		System.out.print("Enter salary: ");
		e.setSalary(s.nextDouble());
		e.incSalary("manager", 15);
		System.out.println("Salary = " + e.getSalary());
		
		Employee e2 = new Employee();
		System.out.print("Enter salary: ");
        e2.setSalary(s.nextDouble());
        e2.incSalary("employee",15);
        System.out.println("Salary = " + e2.getSalary());
	}

}
