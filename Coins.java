public class Coins {
	//gets amount of cents as input, prints same value in quarters and cents
	public static void main (String[] args) {
		//gets input from user
		int centsInput = Integer.parseInt(args[0]);
		
		int quarters = centsInput / 25,
			centsRemainder = centsInput % 25;
		
		System.out.println("Use " + quarters + " quarters and " + centsRemainder + " cents");
		}
	}