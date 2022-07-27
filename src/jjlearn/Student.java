package jjlearn;

public class Student {
	
	String name;
	long mobileNumber;
	int Class;
	char division;
	String address;
	public Student(String name, long mobileNumber) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	
	public void getStudentInfo() {
		System.out.println("Name = " + this.name + "\nMobile Number: " + this.mobileNumber);
	}
	
	

}
