package gmetrix;
import java.util.Scanner;
public class Lottery {
	public static void main(String[] args) {
		//Generate Number
		int lottery = (int)(Math.random()*1000);
		//Prompt
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 Digits: ");
		int guess = input.nextInt();
		//Display Number
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery / 10;
		int lotteryDigit3 = lottery % 10;
		//Find Matches
		int guessDigit1 = guess / 100;
		int guessDigit2 = guess / 10;
		int guessDigit3 = guess % 10;
		System.out.println("The lottery number is " + lottery);
		//Display Matches
		if (guess == lottery)
			System.out.println("Exact Order: $1,000,000");
		else if (guessDigit1 == lotteryDigit2 
				&& guessDigit2 == lotteryDigit3
				&& guessDigit3 == lotteryDigit1
				&& guessDigit3 == lotteryDigit2
				&& guessDigit2 == lotteryDigit1
				&& guessDigit1 == lotteryDigit3)
			System.out.println("All matching: $1,000");
		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2
				|| guessDigit2 == lotteryDigit3
				|| guessDigit3 == lotteryDigit1
				|| guessDigit3 == lotteryDigit2
				|| guessDigit3 == lotteryDigit3)
			System.out.println("One Match: $10");
		else
			System.out.println("No Match: $0 :(");			
	}
}
