
public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	private int id;
	
	public void setSalary(double salary){
		if(salary > 5000 && salary <= 30000)
			this.salary = salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public void incSalary(String job , int bonus){
		int incVal = 0;
		if(job.equals("manager"))
			incVal = 1000;
		else if(job.equals("employee"))
			incVal = 500;
		
		double newSalary = salary + incVal * (1 + bonus / 100);
		this.setSalary(newSalary);
	}
	public void setFirstName(String fn){
		firstName = fn;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastNmae(String ln){
		lastName = ln;
	}
	public String getLastName(){
		return lastName;
	}
	public void setId(int d){
		this.id = d;
	}
	public int getId(){
		return id;
	}

}
