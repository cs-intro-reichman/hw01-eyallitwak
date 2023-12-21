public class Triangle {
	//gets 3 numbers as inputs, prints whether they can form a triangle
	public static void main (String[] args) {
		//gets values form user
		int a = Integer.parseInt(args[0]),
			b = Integer.parseInt(args[1]),
			c = Integer.parseInt(args[2]);
		
		//declares a boolean that will be true if user's input can be triangle
		boolean isTriangle = (a + b > c) && (a + c > b) && (b + c > a);
		
		System.out.println(a + ", " + b + ", " + c + ": " + isTriangle);
	}
}