package multiThreading;

public class MultiThreadingDemo2 extends Thread {
	public void run() {
		for (int i=0; i<5;i++) {
			System.out.println("Running a thread");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadingDemo2 t1 = new MultiThreadingDemo2();
		t1.start();

	}

}
