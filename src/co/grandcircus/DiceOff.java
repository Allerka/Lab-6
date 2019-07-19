package co.grandcircus;

import java.util.Scanner;
import java.util.Random;

public class DiceOff {

	public static void main(String[] args) {

		// initial setup
		Scanner scan = new Scanner(System.in);
		int faces;
		int die1;
		int die2;
		char cont = 'y';

		// user prompt
		System.out.print("It's dice time! We're gonna roll two dice. ");
		while (cont == 'y' || cont == 'Y') {
			System.out.print("How many sides should they have? ");
			faces = scan.nextInt();
			die1 = results1(faces);
			die2 = results2(faces);

			// give the results
			System.out.println("GO! DICE ROLL!");
			System.out.println(die1);
			System.out.println(die2);

			// check for special results
			if (die1 == 1 && die2 == 1) {
				System.out.println("Snake eyes!");
			} else if ((die1 + die2) == 7 || (die1 + die2 == 11)) {
				System.out.println("Craps!");
			} else if (die1 == 6 && die2 == 6) {
				System.out.println("Box cars!");
			}

			System.out.println("Roll again? (y/n)");
			cont = scan.next().charAt(0);
		}
		System.out.println("Better luck next time!");
		scan.close();
	}

	private static int results1(int die1) {
		die1 = generateRandomDieRoll(die1) + 1;
		return die1;
	}

	private static int results2(int die2) {
		die2 = generateRandomDieRoll(die2) + 1;
		return die2;
	}

	private static int generateRandomDieRoll(int faces) {
		Random rand = new Random();
		return rand.nextInt(faces);
	}
}
