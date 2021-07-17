package Number;

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
		public void getEvenOdd(int Number) {
			if(Number%2 == 0)
				System.out.println(Number+" is even number");
			else
				System.out.println(Number+" is odd number");
		}


public class EvenOrOdd {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the number to check even & odd : ");
		int Number = utility.getIntValue();
		utility.getEvenOdd(Number);
	}
}

}


/* Main class
 * 
 */



/*
 * 
 */