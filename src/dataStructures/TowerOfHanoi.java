package dataStructures;

public class TowerOfHanoi {
	
	static void solveTowerOfHanoi(int n, char fromRod,char toRod, char interRod) {
		if(n==1) {
			System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
			return;
		}
		solveTowerOfHanoi(n-1,fromRod,interRod,toRod);
		System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);
		solveTowerOfHanoi(n-1,interRod,toRod,fromRod);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfDisk = 4;
		solveTowerOfHanoi(numberOfDisk,'A','C','B');

	}

}
