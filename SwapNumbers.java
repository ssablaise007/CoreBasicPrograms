package Swapping;

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
	public void SwapNumber(int num1 ,int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = "+num1+" num2 = "+num2);
		}
/* Main Class
 * 
 */

public class SwapNumbers {
public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.print("Enter first number num1 : ");
		int num1 = utility.getIntValue();
		System.out.print("Enter first number num2 : ");
		int num2 = utility.getIntValue();
		utility.SwapNumber(num1,num2);
		}
}

}
