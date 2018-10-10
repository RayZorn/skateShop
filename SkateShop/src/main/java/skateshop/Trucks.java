package skateshop;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Trucks {

	int qty;
	String brand;
	int price;

	public Trucks(int qty, String brand, int price) {
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

		Trucks truck1 = new Trucks(2, "Independent", 12);
		Trucks truck2 = new Trucks(5, "Grind", 14);
		Trucks truck3 = new Trucks(7, "Slide", 11);
		Trucks truck4 = new Trucks(4, "Bearing", 24);
		Trucks truck5 = new Trucks(6, "Real", 21);

		List<Trucks> trucklist;
		trucklist = new LinkedList<Trucks>();

		trucklist.add(truck1);
		trucklist.add(truck2);
		trucklist.add(truck3);
		trucklist.add(truck4);
		trucklist.add(truck5);

		System.out.println("These are the trucks we have on offer today: ");

		for (int i = 0; i < trucklist.size(); i++) {

			System.out.println(trucklist.get(i).qty + " " + trucklist.get(i).brand + " " + "trucks at "
					+ trucklist.get(i).price + " each");
		}

		System.out.println("Please type the name of the brand you would like to buy.");

		Scanner s = new Scanner(System.in);
		String choice = s.nextLine();

		for (int i = 0; i < trucklist.size(); i++) {

			if (trucklist.get(i).brand.equals(choice)) {

				cost = trucklist.get(i).price;
				System.out.println(trucklist.get(i).price);
				break;

			}

		}
		int funds = 100;
		funds = funds - cost;

		System.out.println("Thankyou. " + cost + " dollars was subtracted from your total, with your new total being "
				+ funds + " dollars");

	}
}
