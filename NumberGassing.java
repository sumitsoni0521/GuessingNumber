import java.util.Scanner;

public class NumberGassing {

	public static void guessingNumber() {

		// Scanner class
		Scanner sc = new Scanner(System.in);

		// variable declare
		int number = 1 + (int) (100 * Math.random());

		// triale variable
		int K = 5;
		int guess, i;

		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\b Wellcome to the Game");
		System.out.println("\t\t\t\t The Game is Guess the number between 1 to 100 within 5 trials.\n");

		// for loop to guessing the computer
		for (i = 0; i < K; i++) {
			System.out.println("\b\nGuess the number:\n");

			// take input for gussing the number
			guess = sc.nextInt();

			// if statement
			if (number == guess) {
				System.out.println("Congratulations!\" + \" You guessed the number.");
				break;
			} else if (number > guess && i != K) {
				System.out.println("The number is " + "greater than " + guess);
			} else if (number < guess && i != K) {
				System.out.println("The number is" + " less than " + guess);
			}
		}
		if (i == K) {
			System.out.println("\nGame is Over ");
			System.out.println("\n The number was " + number);
		}
	}

	public static void main(String[] args) {
		// function calling
		// guessingNumber();
		// when game is over then here using type 'Y' the game is re-start as per user
		// choice
		Scanner sc = new Scanner(System.in);
		char playAgain;

		do {
			// Function calling
			guessingNumber();

			// Prompting the user to play again
			System.out.println("\nDo you want to play again? (Y/N)");
			playAgain = sc.next().charAt(0);

		} while (playAgain == 'Y' || playAgain == 'y');
		System.out.println("Thank you for playing!");
		sc.close();
	}
}
