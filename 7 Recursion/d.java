//4) Write a Program that calculates the power of a number using recursion where base and exponent is entered by the user.

// Java program to find the power of a number
// using Recursion

class d {

	// Function to calculate N raised to the power P
	public static int power(int B, int E)
	{
		if (E == 0)
			return 1;
		else
			return B * power(B, E - 1);
	}

	// Driver code
	public static void main(String[] args)
	{
		int B = 2;
		int E = 3;

		System.out.println(power(B, E));
	}
}
