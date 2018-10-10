package skateshop;

import java.util.*;
import java.util.List;

import org.mockito.stubbing.OngoingStubbing;

import java.awt.*;

public class SkateFloor {

	static Scanner sc = new Scanner(System.in);
	static int choice;
	static int funds = 100;
	

	public static void main(String[] args) {
				
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

					Decks.isSelected();
					break;

				case 2:
				
					Trucks.isSelected();
					break;

				case 3:

					Wheels.isSelected();
					break;

				case 4:
					
					Shoes.isSelected();
					break;

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
