package QnR;
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
	public void getQuotientRemainder(int Divisor, int Dividend ) {
		int Quotient, Remainder;
		Remainder = Dividend % Divisor;
		Quotient = Dividend / Divisor;
		System.out.println("Remainder = " +Remainder+ " Quotient = " +Quotient);
			
		}
/*
 * Main class
 */
public class QuotientandRemainder {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the Devident: ");
		int Devident = utility.getIntValue();
		System.out.print("Enter the Devisor : ");
		int Devisor = utility.getIntValue();
		utility.getQuotientRemainder(Devisor, Devident);
		
	}
}

/*
 * 
 */