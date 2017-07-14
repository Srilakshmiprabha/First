
class Stude {
	int rollno;
	String name;
	float fee;

	Stude(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

public class Usethis {
	public static void main(String args[]) {
		Stude s1 = new Stude(11, "vj", 5000f);
		Stude s2 = new Stude(12, "aad", 6000f);
		s1.display();
		s2.display();
	}
}
