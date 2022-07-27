package inheritance;

public class Employee {
	String name;
	String dob;
	
	public Employee(String name, String dob) {
		this.name = name;
		this.dob = dob;
	}
	
	public void getData() {
		System.out.println("Name = " + this.name);
		System.out.println("Date of birth = " + this.dob);
		
	}

}
