package collections;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] jjInt;
		jjInt = new Integer[] {34,56,76,91};
		for(Integer i:jjInt) {
			System.out.println(i);
		}
		
		Object[] jjObj;
		jjObj = new Object[] {65,"Jebin",83.44,"Paul"};
		for (Object jj: jjObj) {
			System.out.println(jj);
		}

	}

}
