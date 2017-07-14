package programs;

import java.util.Scanner;

public class Office {
	public static void main(String[] args) {
		Subclass subobj = new Subclass();
		System.out.println("enter the floor");
		Scanner sc = new Scanner(System.in);
		int floor = sc.nextInt();
		if (floor == 4 || floor == 5 || floor == 6 || floor == 7 || floor == 8)

		{
			subobj.display(floor);
			subobj.print();
		} else {
			System.out.println("enter floor between 4-8");
			floor = sc.nextInt();
			subobj.display(floor);
			subobj.print();
		}

	}

}

class superclass {
	String office = "ascends";
	String phase = "pinnacle";

	void print() {
		System.out.println("your office is in" + office + phase);
	}
}

class Subclass extends superclass {
	void display(int floor)

	{
		if (floor == 4)
			System.out.println("you have full creative and ofs");
		else if (floor == 5) {
			System.out.println("you have abc and bbc");

		} else if (floor == 6) {
			System.out.println("you have gss and ford");

		} else if (floor == 7) {
			System.out.println("you have mmm and ffc");

		} else if (floor == 8) {
			System.out.println("you have 9bc and rrc");

		}
	}
}