package fileAndException;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * When File already exists
		 * 
		 */
		try {
			File jjFile = new File("jjText.txt");
			System.out.println("Size of file is " + jjFile.length());
			System.out.println("File exist : " + jjFile.exists());
			System.out.println("File name : " + jjFile.getName());
			System.out.println("File path : " + jjFile.getPath());
			System.out.println("File parent : " + jjFile.getParent());
			System.out.println("File absolute path : " + jjFile.getAbsolutePath());
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * 
		 * When File Don't exist
		 * 
		 */
		
		System.out.println("********************************************\n********************************************");
		try {
			File jjFile = new File("NoFile.txt");
			System.out.println("File exsits : " + jjFile.exists());
			System.out.println("Size of file is " + jjFile.length());		
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
