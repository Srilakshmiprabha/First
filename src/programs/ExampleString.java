package programs;

import java.lang.String;

public class ExampleString {

	public static void main(String[] args) {
		
		 String s1="java"; String s2="example"; String s3=new String("java");
		 
		ExampleString ex = new ExampleString();
		boolean result = ex.run("java", "123");
		boolean expected = false;
		ex.test(result, expected);
		result = ex.run("java","java");
		expected = false;
		ex.test(result, expected);
		result = ex.run("s1","java");
		expected = false;
		ex.test(result, expected);
		result = ex.run("s2","java");
		expected = true;
		ex.test(result, expected);
	/*	result = ex.run2("s2","java");
		expected = true;
		ex.test(result, expected);
	
		
		/*result = ex.run2("s2","java");
		expected = true;
		ex.test(result, expected);
	
		System.out.println();*/
	}

	boolean run(String s1, String s2) {
		if (s1.equals(s2)) {
			return true;
		} else {
			return false;
		}
			
	}
	boolean run1(String s1,String s2)
	{
		if(s1==s2)
		{
			return true;
		} else {
			return false;
		}
		}
	
/*boolean run2(String s1,String s2)
{
	if(s1.compareTo(s2))
	{
		return true;
	} else {
		return false;
	}
	}*/

	void test(boolean re, boolean ex) {
		if (re == ex)
			System.out.println("test pass");
		else
			System.out.println("test fail");
	}

}
