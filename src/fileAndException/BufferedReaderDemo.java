package fileAndException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader = null;
		BufferedReader jjRead = null;
		String path = "./src/fileAndException/jjText.txt";
		try {
			reader = new FileReader(path);
			jjRead = new BufferedReader(reader);
			String a = "";
			while((a = jjRead.readLine()) !=null) {
				System.out.println(a);
				
			}
			jjRead.close();
			reader.close();
			
			
		}catch ( FileNotFoundException e) {
			System.out.println("The file is not found!!");
		}catch(IOException e) {
			System.out.println("Error reading the file!!");
		}

	}

}
