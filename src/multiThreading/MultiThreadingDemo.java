package multiThreading;

public class MultiThreadingDemo extends Thread {
	public void run() {
		System.out.println("Running a thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadingDemo t1 = new MultiThreadingDemo();
		t1.start();

	}

}
