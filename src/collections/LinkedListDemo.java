package collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> jjLink = new LinkedList<String>();
		jjLink.add("USA");
		jjLink.add("China");
		System.out.println(jjLink);
		// Add to the first
		
		jjLink.addFirst("India");
		System.out.println(jjLink);


	}

}
