package HarmnicNum;

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
		public void getHarmonicNumber(int N) {
			double Harmonicnumber = 0;
			
			for(double i=1; i<=N; i++) {
				Harmonicnumber += 1/i;
			}
			System.out.println("Nth Harmonic Number of "+N+" = "+Harmonicnumber);
		}
/*
 * Main Class
 */
public class Harmonic {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the number to check Harmonic number : ");
		int Number = utility.getIntValue();
		utility.getHarmonicNumber(Number);;
	}

}
}