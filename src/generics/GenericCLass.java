package generics;

public class GenericCLass <T> {
	
	T myData;
	
	public GenericCLass(T inData) {
		this.myData = inData;
		
	}
	
	public void printData() {
		System.out.println(myData);
	}
	
	public void updateData(T newData) {
		this.myData = newData;
	}

}
