package inheritance;

public class Developer extends Employee {
	String languagesKnown;
	
	public Developer(String name, String dob, String languages) {
		super(name,dob);
		this.languagesKnown = languages;
	}
	
	public void getSkills() {
		System.out.println("Languages known: " + this.languagesKnown);
	}

}
