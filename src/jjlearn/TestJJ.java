package jjlearn;
import java.util.Arrays;

class TestJJ{
	 int id=1;
	 String name="abc";
	 TestJJ(int id, String name)
	 {
	 id=id;
	 this.name=name;
	 }
	 public static void main(String args[])
	  {
		 String s1 = "Welcome";
		 String s2="To Java";
		 String s3=s1+s2;
		 String s4=s1.concat(s2);
		 System.out.println(s3==s4);
		 System.out.println(s3.equals(s4));
	  }
	 
	 
	}
	

