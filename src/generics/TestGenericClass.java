package generics;

public class TestGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub56
		
		GenericCLass<Integer> jj1 = new GenericCLass<>(56);
		GenericCLass<Double> jj2 = new GenericCLass<Double>(345.567);
		jj1.printData();
		jj2.printData();
		jj2.updateData(56.24);
		jj2.printData();

	}

}
