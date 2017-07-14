package programs;

class Binder  {
	void act() {
		System.out.println("animal is eating...");
	}

	void run() {
		System.out.println("animal is running");
	}
}

 public class Staticbind extends Binder {
	void act() {
		System.out.println("dog is eating...");
	}
	public static void main(String args[]) {
		System.out.println("binding concept");
		Binder a = new Staticbind();//dynamic binder
		a = new Binder();//static binder
		System.out.println(a instanceof Binder);
		System.out.println(a instanceof Staticbind);
		
		a.run();
		a.act();
	}
}
