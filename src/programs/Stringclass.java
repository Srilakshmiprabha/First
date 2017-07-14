package programs;

public class Stringclass {
	public static void main(String[] args) {
		String name = new String("hello angel");
		String name1 = new String("welcome to world");
		String s1 = "hi this is the string";
		String s2 = "hare";
		String s3 = "hare";
		String s4 = s1.intern();
		char ch = name.charAt(4);
		System.out.println(ch);
		name = name.concat(name1);
		System.out.println(name);
		System.out.println(s1.contains("this is"));
		System.out.println(s1.contains("am"));
		System.out.println(s1.endsWith("t"));
		System.out.println(s2.equalsIgnoreCase(s3));
		String sf = String.format("value is %32.12f", 32.33434);
		byte[] barr = s2.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.println(barr[i]);
		}
		char[] c = new char[10];

		name1.getChars(3, 6, c, 0);
		System.out.println(c);
		s3 = s1.intern();
		System.out.println(s1 == s4);
		System.out.println(s2 == s3);
		System.out.println(s1.isEmpty());
		String join = String.join("delimiter", "hi");
		int s = s1.length();
		System.out.println("length is" + s);
		String s5 = name1.replace("om", "mo");
		System.out.println("replaced" + name1);

		String s6 = name1.replace("om", "moi");
		System.out.println("replaced" + name1);
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		String[] words = name1.split("\\s");
		for (String w : words) {
			System.out.println(w);

		}
		System.out.println(s1.startsWith("hi"));
		System.out.println(name1.substring(2, 4));
		char[] cl = s1.toCharArray();
		for (int i = 0; i < cl.length; i++) {
			System.out.print(cl[i]);}
			System.out.println(s1.toUpperCase());
			System.out.println(s1.toLowerCase());
			System.out.println(s1.trim() + "hai");
			int value = 10;
			String s7 = String.valueOf(value);
			System.out.println(s7 + 10);

		}
	}
