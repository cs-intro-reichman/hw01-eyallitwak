public class AddTwo {
	//gets 2 numbers as input, prints sum in a fancy way
	public static void main (String[] args) {
		//gets input from user
		int a = Integer.parseInt(args[0]),
			b = Integer.parseInt(args[1]);
		
		System.out.println(a + " + " + b + " = " + (a + b));
		}
	}