package programs;

public class Demaoneg extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {
		Demaoneg t1 = new Demaoneg();// creating thread
		Demaoneg t2 = new Demaoneg();
		Demaoneg t3 = new Demaoneg();
		t1.start();
		t1.setDaemon(true);
		t2.setDaemon(true);
		//t1.start();
		t2.start();
		t3.start();
	}
}
