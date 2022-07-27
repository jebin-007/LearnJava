package polymorphism;

public class PolymorphismDemo {
	
	public void add(int a, int b) {
		System.out.println("Sum of two numbers :" + a + b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Sum of three numbers :" + a + b + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismDemo jj1 = new PolymorphismDemo();
		jj1.add(4,5);
		jj1.add(5,7,8);

	}

}
