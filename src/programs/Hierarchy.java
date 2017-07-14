package programs;

import java.util.Scanner;

public class Hierarchy {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Man ma = new Man();
		Monkey mo = new Monkey();
		if (num == 1||num == 5||num == 3||num == 7) {
			ma.check2();
			ma.check1();
		} else if (num ==2||num == 6||num == 4||num == 8) {
			mo.check3();
			mo.check1();
		} else {
			System.out.println("u will not have next birth");
		}
	}
	}

	class Mammal {
		void check1() {
			System.out.println("in next birth");
		}
	}

	class Man extends Mammal {
		void check2() {
			System.out.println("u  will be man");
		}
	}

	class Monkey extends Mammal {
		void check3() {
			System.out.println("u will be monkey");
		}
	}
