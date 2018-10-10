package skateshop;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Wheels {

	int qty;
	String brand;
	int price;

	public Wheels(int qty, String brand, int price) {
		super();
		this.qty = qty;
		this.brand = brand;
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void isSelected() {

		int cost = 0;

		Wheels wheel1 = new Wheels(2, "Independent", 59);
		Wheels wheel2 = new Wheels(8, "Birdhouse", 59);
		Wheels wheel3 = new Wheels(5, "Foundation", 59);
		Wheels wheel4 = new Wheels(9, "Zero", 59);
		Wheels wheel5 = new Wheels(2, "Element", 59);

		List<Wheels> wheelList;
		wheelList = new LinkedList<Wheels>();

		wheelList.add(wheel1);
		wheelList.add(wheel2);
		wheelList.add(wheel3);
		wheelList.add(wheel4);
		wheelList.add(wheel5);

		System.out.println("These are the wheels we have on offer today: ");

		for (int i = 0; i < wheelList.size(); i++) {

			System.out.println(wheelList.get(i).qty + " " + wheelList.get(i).brand + " " + "wheels at "
					+ wheelList.get(i).price + " each");
		}

		System.out.println("Please type the name of the brand you would like to buy.");

		Scanner s = new Scanner(System.in);
		String choice = s.nextLine();

		for (int i = 0; i < wheelList.size(); i++) {

			if (wheelList.get(i).brand.equals(choice)) {

				cost = wheelList.get(i).price;
				System.out.println(wheelList.get(i).price);
				break;

			}
		}

	}
}