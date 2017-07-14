import java.util.Scanner;

public class Area {
	static double square, rectangle, triangle;
	double area1, area2, area3;

	void calculate(double a) {
		area1 = a * a;

	}

	void calculate(double a, double b) {
		area2 = a * b;

	}

	void calculate(double value, double b, double c) {
		area3 = value* b * c;
		
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);

		run(area1, area2, area3);
	}

	public static void main(String[] args) {
		Area a = new Area();
		System.out.println("enter side of square");
		Scanner sc = new Scanner(System.in);
		double side = sc.nextDouble();
		a.calculate(side);
		square = side * side;
		System.out.println("enter length and breadth");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		a.calculate(length, breadth);
		rectangle = length * breadth;
		System.out.println("enter base and height");
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		final double value = 0.5;
		a.calculate(value, base, height);
		triangle = 0.5 * base * height;
	}

	void run(double area1, double area2, double area3) {
		
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		System.out.println(square);
		System.out.println(rectangle);
		System.out.println(triangle);

		if ( area1== square && area2 == rectangle &&area3 == triangle) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}
	}

}
