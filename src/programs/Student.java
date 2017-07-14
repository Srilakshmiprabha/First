package programs;

public class Student {
	static int last_roll = 100;
	int roll_no;

	Student() {
		roll_no = last_roll;
		last_roll++;
	}

	// @Override
	public int hashCode() {
		return roll_no;
	}

	// Driver code
	public static void main(String args[]) {
		Student s = new Student();

		System.out.println(s);
		System.out.println(s.toString());
	}
}