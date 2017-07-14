package programs;

import java.time.*;
import java.util.Scanner;

public class Year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
int number=sc.nextInt();
		Month month = Month.of(number);
		// System.out.println(month.getValue());
		System.out.println(month.name());
	}
}
