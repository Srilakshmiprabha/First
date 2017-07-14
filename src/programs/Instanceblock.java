package programs;

import java.util.Scanner;

public class Instanceblock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your running time");
		float time = sc.nextFloat();

		Intialize init = new Intialize();
		init.run(time);

	}

}

class Intialize {
	int speed;
	{
		System.out.println("instance block");
		speed = 120;
	}

	Intialize() {
		System.out.println("im constructor");
	}

	void run(float time) {
		System.out.println("distance" + time * speed);
	}
}