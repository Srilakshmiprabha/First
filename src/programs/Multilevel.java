package programs;

import java.util.Scanner;

public class Multilevel 

	{
		public static void main(String[] args) {
			System.out.println("enter a number");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			Prediction3 pre=new Prediction3();
			if (num >0&&num<50) {
				pre.check1();
			} else if (num>=50&&num<70) {
				pre.check2();
			
			}else if (num>=70&&num<100) {
				pre.check2();
			
			} else if (num>=100&&num<120) {
				pre.check2();
			
			}else {
				System.out.println("be careful anything may happen at any time");
			}
		}
		}

	class Prediction {
		void check1() {
			System.out.println("supprise is there for u");
		}
	}

	class Prediction1 extends Prediction  {
		void check2() {
			System.out.println("u wil die in accident");
		}
	}

	class Prediction3 extends Prediction1 {
		void check3() {
			System.out.println("u can see god after death");
		}
	}


