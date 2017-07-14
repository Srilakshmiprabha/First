package programs;

public class Wrapper {

	public static void main(String args[]) {
		
		int a = 20;
		Integer i = Integer.valueOf(a);
		Integer j = a;

		System.out.println(a + " " + i + " " + j);
		i = new Integer(3);
		a = i.intValue();
		j = a;

		System.out.println(a + " " + i + " " + j);
		Character c = new Character('a');
		char d = c.charValue();
		char e = d;

		System.out.println(d + " " + c + " " + d);
		c = 'a';
		c = Character.valueOf(c);
		d = c;
		System.out.println(d + " " + c + " " + d);

	}
}
