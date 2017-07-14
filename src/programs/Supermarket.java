package programs;

import java.util.Scanner;

public class Supermarket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount and item you purchased");
		System.out.println("you can either purchase cosmetics or household");
		System.out.println("enter amount");
		int amount = sc.nextInt();
		System.out.println("enter item");
		String item = sc.next();
		Market market = new Market(amount, item);
		market.offer();
		market.reduce();
		sc.close();
	}
}

interface Discount {
	void offer();

}

interface Item {
	void reduce();

}

class Market implements Discount, Item {
	int amt;
	String item;

	public Market(int amount, String item) {

		this.item = item;
		this.amt = amount;

	}

	public void offer() {
		if (item. equals("cosmetics") || item .equals("household")) {
			System.out.println("you have an gift worth 300");
		} else {
			System.out.println("u entered that is not available in shop");
		}
	}

	public void reduce() {
		if (amt > 3000) {
			amt = amt - 500;
			System.out.println("u have reduction of" + amt);
		} else {
			System.out.println("u have to pay full amount");
		}
	}
}