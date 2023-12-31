/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		//gets lower and upper limit from user
		int lowerLimit = Integer.parseInt(args[0]),
			upperLimit = Integer.parseInt(args[1]);
		
		//declares possible range of generated random numbers
		int range = upperLimit - lowerLimit;
		
		int rand1 = lowerLimit + (int) (Math.random() * range),
			rand2 = lowerLimit + (int) (Math.random() * range),
			rand3 = lowerLimit + (int) (Math.random() * range);
		
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
		
		//checks which random number is minimal
		int minimalRand = Math.min(Math.min(rand1, rand2), rand3);
		System.out.println("The minimal generated number was " + minimalRand);
	}
}
