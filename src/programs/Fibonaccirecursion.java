package programs;

import java.util.Scanner;

public class Fibonaccirecursion {
	static int a, b;

	public static void fib(int i) {
		int c = 0;
		if (i < 2) {
			a = 0;
			b = 1;
		} else {
			fib(i - 1);
			c = b;
			b = a + b;
			a = c;
		}
		System.out.print(a + ",");
	}

	public static void main(String ar[]) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Number  ");
		a = s.nextInt();
		System.out.print("Fibonacci numbers are ");
		fib(a);
	}
}
