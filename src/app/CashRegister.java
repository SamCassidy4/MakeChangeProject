package app;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the price of an item you recently purchased: ");
		double userP = sc.nextDouble();

		System.out.println("Please enter the amount of cash you used: ");
		double userC = sc.nextDouble();

		double userChange = userC - userP;

		double changeBack = userChange;

		double oneV = 1;
		double fiveV = 5;
		double tenV = 10;
		double twentyV = 20;

		int one, five, ten, twenty;

		double pennyV = .01;
		double nickelV = .05;
		double dimeV = .1;
		double quarterV = 0.25;

		double quarter, dime, nickel, penny;

		if (userP > userC) {
			System.out.println(" You have not paid the appropriate amount for this item.");
		} else if (userC == userP) {
			System.out.println("You have given exact change, no change needed");
		} else {
			System.out.println("The cashier owes you " + "$" + userChange);

		}
		changeBack = (double) (userChange);

		twenty = (int) (changeBack / twentyV);
		changeBack -= twenty * twentyV;

		ten = (int) (changeBack / tenV);
		changeBack -= ten * tenV;

		five = (int) (changeBack / fiveV);
		changeBack -= five * fiveV;

		one = (int) (changeBack / oneV);
		changeBack -= one * oneV;

		quarter =  (int)(changeBack / quarterV);
		changeBack -= (quarter * quarterV);

		dime = (int)(changeBack / dimeV);
		changeBack -= dime * dimeV;

		nickel = (int)(changeBack / nickelV);
		changeBack -= nickel * nickelV;

		penny = (int)(changeBack / pennyV);
		changeBack -= penny* pennyV;

		System.out.printf("%d: Twenty dollar bills \n", twenty);

		System.out.printf("%d: Ten dollar bills \n", ten);

		System.out.printf("%d: Five dollar bills \n", five);

		System.out.printf("%d: One dollar bills \n", one);

		System.out.printf("%f: Quarters \n", quarter);
		
		System.out.printf("%f: Dimes \n", dime);
		
		System.out.printf("%f: Nickels \n", nickel);
		
		System.out.printf("%f: Pennies \n", penny);

		sc.close();
	}

}
