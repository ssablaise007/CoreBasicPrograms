package Factors;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	// get integer input
	public int getIntValue() {
		return scanner.nextInt();
	}
	
 * Utility Class
 */
		public void getPrimeFactor(int N) {
			int cnt;
			System.out.print("prime factor of "+N+" =");
			for (int i=2;i<=N/2;i++ ){
				   cnt=0;
				if ( N % i == 0 ) {
					   for( int j=2;j<=i/2;j++ ){
						   if( i%j ==0)
							   cnt = 1;
					   }
					   if(cnt == 0) 
						   System.out.print(" "+i);   
				} 
			}
		}

/*
 * Main Class
 */
public class FindingFactor {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the number to check primefactors : ");
		int Number = utility.getIntValue();
		utility.getPrimeFactor(Number);
	}
}

/*
 * 
 */

