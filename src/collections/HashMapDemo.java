package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> jjHash = new HashMap<Integer, String>();
		jjHash.put(4,"Garry");
		jjHash.put(2,"Lenna");
		jjHash.put(5,"Tony");
		System.out.println(jjHash);
		System.out.println("Value for key 2 is :" + jjHash.get(2));
		
		// Put if absent method
		
		jjHash.putIfAbsent(5, "Ulia");
		jjHash.putIfAbsent(1, "Jebin");
		
		System.out.println("Hashmap after putIfAbsent : " + jjHash);

		// entrySet() method returns and Entry set, Entry object is like a key value pair
		for(Entry<Integer, String> jjEntry : jjHash.entrySet()) {
			System.out.println(jjEntry.getKey() + " : " + jjEntry.getValue());
		}
		
		// Use getKeySet method
		
		Set<Integer> jjKeys = jjHash.keySet();
		System.out.println("Key set is : " + jjKeys);

	}

}
