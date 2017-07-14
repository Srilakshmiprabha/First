package programs;

public class Setencap {
	private String office;
	String str = new String("Harsha");
	String str1 = "Harsha";
	private int phase;
	private int floor;

	void setter(String office, int phase, int floor) {
		this.office = office;
		this.phase = phase;
		this.floor = floor;
		System.out.println("office" + office + "  " + "phase" + phase + "  " + "floor" + floor);
	}

	public static void main(String[] args) {
		Setencap encap = new Setencap();
		encap.setter("fullcraetive", 2, 4);
	}

}
