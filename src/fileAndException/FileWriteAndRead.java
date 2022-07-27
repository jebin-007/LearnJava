package fileAndException;

import java.io.BufferedWriter;

import java.io.FileWriter;

public class FileWriteAndRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "./src/fileAndException/jjText.txt";
		
		FileWriter write = null;
		BufferedWriter jjBufferedWriter = null;
		try {
			write = new FileWriter(path,true);
			jjBufferedWriter = new BufferedWriter(write);
			jjBufferedWriter.newLine();
			jjBufferedWriter.append("This will append or add?");
			jjBufferedWriter.write("This is from write method");
			jjBufferedWriter.close();
		
			write.close();
			
		}catch (Exception e){
			
			e.printStackTrace();
			
		}finally {
			
		}
		
		
	}
		

}
