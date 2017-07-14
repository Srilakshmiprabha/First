import java.util.Scanner;

public class Staticfunction {
	public static void main(String[] args) {
		int workinghours;
		System.out.println("enter your working hours");
		Scanner sc = new Scanner(System.in);
		
		workinghours = sc.nextInt();sc.close();
		Staticblock.logout(workinghours);
		/*Staticblock s = new Staticblock();
		s.logout(workinghours);*/
	}

}

class Staticblock {
	static String company = "fullcreative";

	 static void logout(int workinghours)

	{
		if (workinghours < 8) {
			int temp = 8 - workinghours;

			System.out.println("you have to work still"  + temp +  "in" + "hours" + company);
		} else {
			System.out.println("u have worked 8 hours can leave now");
		}
	}
}