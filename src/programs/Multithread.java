package programs;

class Multithread extends Thread {
	static int i;

	public void run() {

		for (i = 0; i < 10; i++) {
			// try {
			// Thread.sleep(100);

			// } catch (InterruptedException e) {
			// System.out.println(e);
			// }
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		Multithread m1 = new Multithread();
		Multithread m2 = new Multithread();
		Multithread m3 = new Multithread();
		m1.start();
		try {

			m1.join(50000001);
		} catch (InterruptedException f)

		{
			System.out.println(f);

		}
		System.out.println("parent");
		m2.start();
		m2.setPriority(Thread.MAX_PRIORITY);
		m3.start();
		// m1.run();
		System.out.println("parent");
		m1.setName("hello");
		System.out.println(m1.getName());
	}

}
