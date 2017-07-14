package programs;

public class Stringconversion {
	int rollno;
	String name;
	String city;

	Stringconversion(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	/*public String toString() {
		return rollno + " " + name + " " + city;
	}*/

	public static void main(String args[]) {
		Stringconversion s1 = new Stringconversion(101, "Raj", "lucknow");
		Stringconversion s2 = new Stringconversion(102, "Vijay", "ghaziabad");

		System.out.println(s1);
		System.out.println(s2);
	}
}
