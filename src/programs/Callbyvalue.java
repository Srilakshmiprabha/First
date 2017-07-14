package programs;

public class Callbyvalue {
	int m=100;
	void call(int m){
	
m=m*100;
	}
void called(Callbyvalue cal)
{cal.m=cal.m+140;
	}
public static void main(String[] args) {
	Callbyvalue cal=new Callbyvalue ();
	System.out.println("value before"+cal.m);
	cal.call(50);
	System.out.println("value after"+cal.m);
	System.out.println("value before"+cal.m);
	cal.called(cal);
	System.out.println("value after"+cal.m);
}
}
