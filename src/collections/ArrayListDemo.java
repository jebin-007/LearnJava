package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> jjArray1 = new ArrayList<Integer>();
		jjArray1.add(34);
		jjArray1.add(76);
		jjArray1.add(945);
		jjArray1.add(1,4367);
		System.out.println(jjArray1);
		jjArray1.set(1, 19);
		System.out.println(jjArray1);
		System.out.println("Array contains 76 : " + jjArray1.contains(76));
		
		// Copy an array to another array with traditional approach
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		for(int i=0; i < jjArray1.size();i++) {
			newList.add(jjArray1.get(i));
		}
		
		System.out.println("New copied list using for Loop -> " + newList);
		
		jjArray1.add(2,851);
		jjArray1.add(3,62);
		jjArray1.add(429);
		System.out.println("New updated JJArry -> " + jjArray1);
		// Remove all function
		jjArray1.removeAll(newList);
		System.out.println("JJArray after using remove all -> " + jjArray1);
		
		
		// Use to array method
		
		Integer[]  jjIntArray = new Integer[jjArray1.size()];
		jjArray1.toArray(jjIntArray);
		for(int i=0;i<jjIntArray.length;i++) {
			System.out.println(jjIntArray[i]);
		}
		
		Collections.sort(jjArray1);
		System.out.println("Sorted JJArray -> " + jjArray1);
		
	
		
		//Apply foreach loop on Array list
		
		System.out.println("Using for each loop on ArrayList");
		for(Integer i:jjArray1) {
			System.out.println(i);
		}
	}

}
