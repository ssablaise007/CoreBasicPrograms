package Flipcoin;
import java.util.Scanner;
	/*
	 * Utility Class method for flip coin percentile
	 */
	public Utility() {
	 scanner = new Scanner(System.in);
}
public void flipCoin(int numberOfFlip) {
	 double heads =0,tails = 0;
		for(int i = 0;i < numberOfFlip; i++) {
		double side = Math.random();	
		if(side>0.5) {
			heads++;
		}
		else {
			tails++;
			}
		}
		System.out.println("Number of head occurance ::" + heads);
		System.out.println("Number of tail occurance ::" + (numberOfFlip-heads));
		double headPercent = ((heads * 100)/numberOfFlip);
		double tailPercent = ((tails * 100)/numberOfFlip);
		System.out.println("Heads Percentage ::" + headPercent + "%");
		System.out.println("Tails Percentage ::" + tailPercent + "%");
		}
	/*
	 * Main Class for FlipCoin	 
	 */
public class Flip_coin {
	public class Flipcoin {

		public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter number of time to flip");
		int numberOfFlip = utility.getIntValue();
		utility.flipCoin(numberOfFlip);
		}
	}
}
