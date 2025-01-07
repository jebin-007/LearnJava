package dataStructures;
import java.util.Scanner;

public class EuclidGCD {
	
	static int findGCD(int n1, int n2) {
		if(n2==0)
			return n1;
		else {
			return findGCD(n2,n1%n2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Please enter first number:");
			num1 = s.nextInt();
			System.out.println("Please enter second number:");
			num2 = s.nextInt();
			System.out.println("GCD of " + num1 + " and " + num2 + " is :");
			if(num1>num2 ) {
				System.out.print(findGCD(num2,num1));
			}
			else {
				System.out.print(findGCD(num1,num2));
			}
		}catch (Exception e){
			System.out.println("Invalid input");
		}finally {
			s.close();
		}

	}

}
