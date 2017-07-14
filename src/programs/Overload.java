package programs;

public class Overload {
	public static void main(String[] args) {

		Methodoverload method = new Methodoverload();
		method.print(10, 0);
		method.print(10, "hiii");
		method.print(10, 11, "hiii");

	}
}

class Methodoverload {
	void print(int a, int b) {
		System.out.println("value is" + a + b);
	}

	void print(int a, String b) {
		System.out.println("value is" + a + b);
	}

	void print(int a, int b, String c) {
		System.out.println("value is" + a + b);
	}

}