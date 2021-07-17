package power;
public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	// get integer input
	public int getIntValue() {
		return scanner.nextInt();
	}
	//get characters as input
	public char getCharValue() {
		char alphabate = scanner.next().charAt(0);
		return alphabate;

/*
 * Utility Class
 */
		public void getPower( int Number) {
			
			if(Number >=0 && Number<31) {
				int power=0;
				for(int i=0;i<=Number;i++) {
						power = (1<<i);        // 1* 2^
					System.out.println(" 2^"+i+" = "+power);
				}
			}
			else
				System.out.println(" Number is not between o to 31");
		}
/*
 * Main Class
 */
public class Powerof2 {
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.print("Enter the Number to check power of two : ");
		int Number = utility.getIntValue();
		utility.getPower(Number);
	}
}
/*
 * 
 */



/*
 * 
 */