package generics;



public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testPrint(56);
	   

	}
	
	public static <T> void testPrint(T item) {
		   
		   System.out.println(item + "!!!");
		   
	   }

}
