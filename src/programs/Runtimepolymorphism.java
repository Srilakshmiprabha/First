package programs;

public class Runtimepolymorphism {
	public static void main(String[] args) {
		Act act=new Act();
		System.out.println("value of a"+act.a);

		 act=new Eat();
		 act.action();
		 act=new Dance();
		 act.action();
		 act=new Sing();
		 act.action();
	}

}
class Act
{
	int a=50;
	void action()
	{
	System.out.println("you are running...");
	}
}
class Eat extends Act
{
	int a=88;
	void action()
	{
		System.out.println("you are eating...");
	}
}
class Dance extends Act
{
	int a=96;
	void action()
	{
		System.out.println("you are dancing...");
	}
}
class Sing extends Act
{
	int a=889;
	void action()
	{
		System.out.println("you are SINGing...");
	}
}