package programs;

public class Override {

	public static void main(String[] args) {
		Submethod sub = new Submethod();
		sub.run();
	}
}

class Method {
	void run() {
		System.out.println("your speed is 34kmph ");
	}
}

class Submethod extends Method {

	void run() {
	/*super.run();*/
		System.out.println("yor distance is 30km");
		super.run();
	}

}
