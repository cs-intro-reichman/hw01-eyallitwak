public class LinearEq {
	//gets 3 numbers as input, prints a linear equation and solves for x
	public static void main (String[] args) {
		//gets arguments from user
		double a = Double.parseDouble(args[0]),
			   b = Double.parseDouble(args[1]),
			   c = Double.parseDouble(args[2]);
		
		//prints the equation before solving
		System.out.println(a + " * x + " + b + " = " + c);
		
		//solves for x
		double x = (c - b) / a;
		
		System.out.println("x = " + x);
	}
}