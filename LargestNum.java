package Largest;

import Number.Scanner;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	// get integer input
	public int getIntValue() {
		return scanner.nextInt();
	}
/*
 * Utility Class
 */
public void getLargestNumber(int num1, int num2, int num3) {
	int FirstCond, SecondCond;
	FirstCond = (num1>num2)? num1:num2; 
	SecondCond = (FirstCond>num3)? FirstCond:num3; 
	System.out.println(SecondCond+" is greatest among "+num1+", "+num2+", "+num3);
}
/*
 * Main Class
 */
public class LargestNum {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the number num1 : ");
		int num1 = utility.getIntValue();
		System.out.print("Enter the number num2 : ");
		int num2 = utility.getIntValue();
		System.out.print("Enter the number num3 : ");
		int num3 = utility.getIntValue();
		utility.getLargestNumber(num1, num2, num3);
	
		

	}
}
