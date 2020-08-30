package makechange;
import java.util.Scanner;
public class MakeChange {

	public static void main(String[] args) {
		double purchasedPrice = 0;
		int transformedPurchasedPrice = 0;
		double amountTendered = 0;
		int transformedAmountTendered = 0;
		int change = 0;

		//Intro to store
		printIntroduction();

		//Getting user input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hmm...haven't sold one of those since the \"incident\", "
				+ "\nbut I'm sure that one will work just fine. What's the price?");
		//Cast double into integer
		purchasedPrice = keyboard.nextDouble() * 100;
		transformedPurchasedPrice = (int) purchasedPrice;
		System.out.println("You look a little shady...you sure you got money?"
				+ "\nHow much money do you have?");
		//Cast double into integer
		amountTendered = keyboard.nextDouble() * 100;
		transformedAmountTendered = (int) amountTendered;
		change = transformedAmountTendered - transformedPurchasedPrice;

		//Closing scanner because I am a good little programmer
		keyboard.close();

		if (change > 0) {
		//Practice calling methods
		int numTens = getTens(change);
		int numFives = getFives(change);
		int numOnes = getOnes(change);
		int numQuarters = getQuarters(change);
		int numDimes = getDimes(change);
		int numNickels = getNickels(change);
		int numPennies = getPennies(change);
		printAnswer(numTens, numFives, numOnes, numQuarters, numDimes, numNickels, numPennies);
		}
		else if (change == 0) {
			System.out.println("Exact change? What, no tip?...Lousy cheapskate...");
		}
		else {
			System.out.println("I knew you were a bum the moment you walked in,"
					+ "\nI'm running a business here, not a charity!"
					+ "\nCome back when you have more green!"
					+ "\nAnd next time wear a mask!");
		}
	}
		public static int getTens(int change) {
			int tens = change/1000;
			return tens;
		}
		public static int getFives(int change) {
			int fives = (change % 1000) / 500;
			return fives;
		}
		public static int getOnes(int change) {
			int ones = ((change % 1000) % 500) / 100;
			return ones;
		}
		public static int getQuarters(int change) {
			int quarters = (((change % 1000) % 500) % 100) / 25;
			return quarters;
		}
		public static int getDimes(int change) {
			int dimes = ((((change % 1000) % 500) % 100) % 25) / 10;
			return dimes;
		}
		public static int getNickels(int change) {
			int nickels = (((((change % 1000) % 500) % 100) % 25) % 10) / 5;
			return nickels;
		}
		public static int getPennies(int change) {
			int pennies = ((((((change % 1000) % 500) % 100) % 25) % 10) % 5) / 1;
			return pennies;
		}
		public static void printAnswer(int tens, int fives, int ones, int quarters, int dimes, int nickels, int pennies) {
			System.out.println("And here I thought you were penniless, here is your change:");
			if (tens > 0) {
				if (fives > 0 || ones > 0 || quarters > 0 || dimes > 0 || nickels > 0 || pennies > 0) {
					System.out.print(tens + " ten dollar bill, ");
				}
				else {
				System.out.println(tens + " ten dollar bill.");
				}
			}
			if (fives > 0) {
				if (ones > 0 || quarters > 0 || dimes > 0 || nickels > 0 || pennies > 0) {
					System.out.print(fives + " five dollar bill, ");
				}
				else {
				System.out.println(fives + " five dollar bill.");
				}
			}
			if (ones > 1) {
				if (quarters > 0 || dimes > 0 || nickels > 0 || pennies > 0) {
					System.out.print(ones + " one dollar bills, ");
				}
				else {
					System.out.println(ones + " one dollar bills.");
				}
			}
			if (ones == 1) {
				if(quarters > 0 || dimes > 0 || nickels > 0 || pennies > 0) {
					System.out.print(ones + " one dollar bill, ");
				}
				else {
					System.out.println(ones + " one dollar bill.");
				}
			}
			if (quarters > 1) {
				if(dimes > 0 || nickels > 0 || pennies > 0) {
					System.out.print(quarters + " quarters, ");
				}
				else {
					System.out.println(quarters + " quarters.");
				}
			}
			if (quarters == 1) {
				if(dimes > 0 || nickels > 0 || pennies > 0) {
					System.out.print(quarters + " quarter, ");
				}
				else {
					System.out.println(quarters + " quarter.");
				}
			}
			if (dimes > 1) {
				if(nickels > 0 || pennies > 0) {
					System.out.print(dimes + " dimes, ");
				}
				else {
					System.out.println(dimes + " dimes.");
				}
			}
			if (dimes == 1) {
				if(nickels > 0 || pennies > 0) {
					System.out.print(dimes + " dime, ");
				}
				else {
					System.out.print(dimes + " dime.");
				}
			}
			if (nickels > 0) {
				if (pennies > 0) {
					System.out.print(nickels + " nickel, ");
				}
				else {
					System.out.print(nickels + " nickel. ");
				}
			}
			if (pennies > 1) {
				System.out.print(pennies + " pennies.");
			}
			if (pennies == 1) {
			System.out.print(pennies + " penny.");
			}
		}
		public static void printIntroduction() {
			System.out.println("***   Welcome to Andrew's Discarded Crap -n Stuff ***");
			System.out.println("***     Used Toiletries, Dirty Socks 20% off!     ***");
			System.out.println("***     Big Ten Football Tickets Half-Priced!     ***");
			System.out.println("***           --Cash Only, No Refunds--           ***");
			System.out.println("***                --No Loitering--               ***");
			System.out.println("***           --No Mask, No Service--             ***");
			System.out.println("                                                     ");
		}
}
