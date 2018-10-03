package skateshop;

import java.util.*;
import java.util.List;
import java.awt.*;

public class SkateFloor {

	static Scanner sc = new Scanner(System.in);
	static int choice;
	static int funds;

	public static void main(String[] args) {

		Decks deck1 = new Decks(6, "Element", 59.99);
		Decks deck2 = new Decks(3, "Zero", 29.99);
		Decks deck3 = new Decks(4, "DeathWish", 69.99);
		Decks deck4 = new Decks(8, "Birdhouse", 19.99);
		Decks deck5 = new Decks(5, "Foundation", 49.99);

		Wheels wheel1 = new Wheels(2, "Independent", 59.99);
		Wheels wheel2 = new Wheels(8, "Birdhouse", 59.99);
		Wheels wheel3 = new Wheels(5, "Foundation", 59.99);
		Wheels wheel4 = new Wheels(9, "Zero", 59.99);
		Wheels wheel5 = new Wheels(2, "Element", 59.99);

		Trucks truck1 = new Trucks(2, "Independent", 12.99);
		Trucks truck2 = new Trucks(5, "Grind", 14.99);
		Trucks truck3 = new Trucks(7, "Slide", 11.99);
		Trucks truck4 = new Trucks(4, "Bearing", 24.99);
		Trucks truck5 = new Trucks(6, "Real", 21.99);

		Shoes shoe1 = new Shoes(2, "DC", 3.99);
		Shoes shoe3 = new Shoes(2, "Emerika", 3.99);
		Shoes shoe2 = new Shoes(2, "Globe", 3.99);
		Shoes shoe4 = new Shoes(2, "Etnies", 3.99);
		Shoes shoe5 = new Shoes(2, "Supra", 3.99);

		welcomeMessage();

		choice = sc.nextInt();

		while (choice != 0) {

			if (choice > 4 || choice < 0) {

				System.out.println("Please make a valid selection!");
				System.out.print(">>>");
				choice = sc.nextInt();

			} else

				switch (choice) {

				case 1:

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

				case 2:

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

				case 3:

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
						
						choice = sc.nextInt();

					}

				case 4:

					List<Shoes> shoesList;
					shoesList = new LinkedList<Shoes>();

					shoesList.add(shoe1);
					shoesList.add(shoe2);
					shoesList.add(shoe3);
					shoesList.add(shoe4);
					shoesList.add(shoe5);

					System.out.println("These are the shoes we have on offer today: ");

					for (int i = 0; i < shoesList.size(); i++) {

						System.out.println(shoesList.get(i).qty + " " + shoesList.get(i).brand + " " + "shoes at "
								+ shoesList.get(i).price + " each");						

					}

				}

			choice = sc.nextInt();

		}
	}

	public static void welcomeMessage() {
		System.out.println("Welcome to the shop floor! You have exactly 100 dollars to spend today.");
		System.out.println("  ");

		System.out.println("What would you like to buy?");
		System.out.println("");

		System.out.println("1. Decks		2. Trucks");
		System.out.println("");
		System.out.println("3. Wheels		4. Shoes");
		System.out.println("");
		System.out.println("Type 0 to exit");

		System.out.println("");
	}
}
