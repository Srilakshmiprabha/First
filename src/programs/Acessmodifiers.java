package programs;

import org.omg.Messaging.SyncScopeHelper;

public class Acessmodifiers {
	private int a = 90;
	protected int b = 70;
	public int c = 77;
	String d = "hii";

	public static void main(String[] args) {
		Acessmodifiers acess = new Acessmodifiers();
		System.out.println(acess.a);
		System.out.println(acess.b);
		Acess a = new Acess();
		a.execute();
	}
}

class Acess extends Acessmodifiers {
	void execute() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}