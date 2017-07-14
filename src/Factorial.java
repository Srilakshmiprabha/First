import java.util.Scanner;

public class Factorial {
	int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String args[]) {

		Factorial fact = new Factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();

		int result = fact.factorial(number);
		int fact2 = fact.factorials(number);
		fact.run(result, fact2);
	}

	void run(int result, int fact2) {
		if (result == fact2) {
			System.out.println("test pass");

		} else {
			System.out.println("test fail");
		}

	}

	int factorials(int n) {
		int fact2 = 1;
		for (int i = 1; i <= n; i++) {

			fact2 = fact2 * i;
		}
		return fact2;
	}
}
