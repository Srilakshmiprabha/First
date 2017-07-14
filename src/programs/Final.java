package programs;

import java.util.Scanner;

public class Final {
	public static void main(String[] args) {

		final int time;
		Scanner sc = new Scanner(System.in);
		time = sc.nextInt();
		System.out.println("enter time in hours");

		Example1 call = new Example1(time);
		call.eat();
		call.teat();
	}
}

class Example {
	final void teat() {
		System.out.println("it is lunch time");
	}
}

class Example1 extends Example {
	int t;

	Example1(int time) {
		t = time;
	}

	void eat() {
		System.out.println("time to eat" + t);

	}
}
