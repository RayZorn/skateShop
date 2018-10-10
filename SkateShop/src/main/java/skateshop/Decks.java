package skateshop;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Decks {

	int qty;
	String brand;
	int price;

	public Decks(int qty, String brand, int price) {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void isSelected() {

		int cost = 0;

		Decks deck1 = new Decks(6, "Element", 59);
		Decks deck2 = new Decks(3, "Zero", 29);
		Decks deck3 = new Decks(4, "DeathWish", 69);
		Decks deck4 = new Decks(8, "Birdhouse", 19);
		Decks deck5 = new Decks(5, "Foundation", 49);

		List<Decks> deckList;
		deckList = new LinkedList<Decks>();

		deckList.add(deck1);
		deckList.add(deck2);
		deckList.add(deck3);
		deckList.add(deck4);
		deckList.add(deck5);

		System.out.println("These are the decks we have on offer today: ");

		for (int i = 0; i < deckList.size(); i++) {

			System.out.println(deckList.get(i).qty + " " + deckList.get(i).brand + " " + "decks at "
					+ deckList.get(i).price + " each");

		}

		System.out.println("Please type the name of the brand you would like to buy.");

		Scanner s = new Scanner(System.in);
		String choice = s.nextLine();

		for (int i = 0; i < deckList.size(); i++) {

			if (deckList.get(i).brand.equals(choice)) {

				cost = deckList.get(i).price;
				System.out.println(deckList.get(i).price);
				break;

			}

		}

	}
	
	public int calculate(int cost, int money) {
		return money - cost;
	}

}
