package collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Treemap is an ordered Set where the elements are sorted based on the Key
		 * 
		 */
		TreeMap<Integer, String> jjMap = new TreeMap<Integer, String>();
		jjMap.put(15, "Ambrose");
		jjMap.put(8, "Jenny");
		jjMap.put(3, "Tyler");
		jjMap.put(9, "Cassy");
		jjMap.put(34, "Paula");
		jjMap.put(17, "Jebin");
		jjMap.put(2, "Laureen");
		
		System.out.println("Treemap = " + jjMap); // It will be ordered by the Key
		
		Set<Entry<Integer, String>> jjEntries = jjMap.entrySet();
		
		Iterator<Entry<Integer, String>> jjIterator = jjEntries.iterator();
		
		while(jjIterator.hasNext()) {
			System.out.println();
			Entry<Integer, String> jjEntry = jjIterator.next();
			System.out.print(jjEntry.getKey() + " -> " + jjEntry.getValue());
			if(jjEntry.getValue() == "Jebin") { // Removing an element
				jjIterator.remove();
			}
		}
		System.out.println();
		System.out.println("Entry Set after removal -> " + jjEntries);
		System.out.println("Treemap after removal from entry set -> " + jjMap);
		
		

	}

}
