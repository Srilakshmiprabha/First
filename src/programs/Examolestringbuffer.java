package programs;

import java.lang.String;

public class Examolestringbuffer {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("java");
		StringBuffer s2 = new StringBuffer("java");
		Examolestringbuffer ex = new Examolestringbuffer();

		s1.append("prog");System.out.println("append" +"" +s1);
		s1.insert(3, "s");System.out.println("insert" +"" +s1);
		s1.replace(1,3,"Java");  System.out.println("replace" +"" +s1);
		s1.delete(1,3);System.out.println("delete" +"" +s1);
		s1.reverse();System.out.println("reverse" +"" +s1);
		s1.ensureCapacity(50); 
		System.out.println(s1.capacity());
		
		StringBuilder s3 = new StringBuilder("prog");
		StringBuilder s4 = new StringBuilder("c++");
		

		s3.append("prog");System.out.println("append" +" " +s3);
		s3.insert(3, "s");System.out.println("insert" +" " +s3);
		s3.replace(1,3,"Java");  System.out.println("replace" +"" +s3);
		s4.delete(1,3);System.out.println("delete" +"" +s4);
		s4.reverse();System.out.println("reverse" +"" +s4);
		
		
		


	}
}
