import java.util.Scanner;

public class Swap {static int a, b;
	
	void swapping(int num1,int num2)
	{
		num2=(num1+num2)-(num1=num2);
		System.out.println("swapped values are "+num1 +num2);
		 test(num1,num2);
	}	
	public static void main(String[] args) {
		Swap s=new Swap();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a,b");
		a = sc.nextInt();
		b = sc.nextInt();
		s.swapping(a,b);
		}
		void test(int num1,int num2){
			if(num1==b&&num2==a)
			{
				System.out.println("test pass");}
				else{
					System.out.println("test pass");
					
			}
			
		}
		

	

}
