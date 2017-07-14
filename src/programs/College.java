package programs;

public class College extends University {
	void univ() {
		System.out.println("anna university");
	}

	void college() {
		System.out.println("jeppiaar");
	}



	public static void main(String[] args) {
		College c = new College();
		c.univ();
		c.college();
	}
}

abstract class University {
	abstract void univ();
}