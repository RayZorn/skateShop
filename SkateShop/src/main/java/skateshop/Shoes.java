package skateshop;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Shoes {

	int qty;
	String brand;
	int price;

	public Shoes(int qty, String brand, int price) {
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
	
	static int cost = 0;
	static int money = 0;

	public static void isSelected() {
		


		Scanner s = new Scanner(System.in);

		Shoes shoe1 = new Shoes(2, "a", 3);
		Shoes shoe3 = new Shoes(6, "Emerika", 4);
		Shoes shoe2 = new Shoes(3, "Globe", 6);
		Shoes shoe4 = new Shoes(9, "Etnies", 8);
		Shoes shoe5 = new Shoes(5, "Supra", 2);

		List<Shoes> shoesList;
		shoesList = new LinkedList<Shoes>();

		shoesList.add(shoe1);
		shoesList.add(shoe2);
		shoesList.add(shoe3);
		shoesList.add(shoe4);
		shoesList.add(shoe5);
		
		int funds = 100;

		System.out.println("These are the shoes we have on offer today: ");

		for (int i = 0; i < shoesList.size(); i++) {

			System.out.println(shoesList.get(i).qty + " " + shoesList.get(i).brand + " " + "shoes at "
					+ shoesList.get(i).price + " each");
		}

		System.out.println("Please type the name of the brand you would like to buy.");

		String choice = s.nextLine();

		for (int i = 0; i < shoesList.size(); i++) {

			if (shoesList.get(i).brand.equals(choice)) {

				cost = shoesList.get(i).price;
				System.out.println(shoesList.get(i).price);
				break;

			}

		}
		
	}
	
	public int calculate(int cost, int money) {
		return money - cost;
	}
	
}
