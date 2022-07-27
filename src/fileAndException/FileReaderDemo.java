package fileAndException;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String path = "./src/fileAndException/jjText.txt";
		FileReader jjFileRead = null;
		try {
			jjFileRead = new FileReader(path);
			int a = 0;
			while((a = jjFileRead.read()) != -1) {
				System.out.println((char)a);
			}
			jjFileRead.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something happened!!!");
			System.out.println(e);
		}
		
		

	}

}
