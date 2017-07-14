package programs;

class Multithreading implements Runnable {
	static int i;

	public void run() {
		for (i = 0; i <10; i++) {
			System.out.println("child");
		}
	}

	public static void main(String[] args) {
		Multithreading m1 = new Multithreading();
		Thread t = new Thread(m1);
		t.start();
		for (i = 0; i < 5; i++) {
		System.out.println("parent");
		}
	}

}
