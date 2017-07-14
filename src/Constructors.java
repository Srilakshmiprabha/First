
public class Constructors {
	public static void main(String[] args) {
Construct c=new Construct();
Construct c1=new Construct(5);
Construct c2=new Construct(5,10);

	}

}

class Construct {

	Construct()
	{int a,b;
		System.out.println("defaut contructor");run();
	}
	Construct(int a){
		System.out.println("parameterized constructor"+a);
		
	}
	Construct(int a,int b)
	{System.out.println("para contructor"+a +b);
	}
	void run()
	{System.out.println("jj");
	}

}