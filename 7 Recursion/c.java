//3) Write a Program to Find G.C.D of two numbers entered by user Using Recursion

import java.util.Scanner;

public class c {

    // Function to calculate GCD using recursion
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate GCD using recursion
        int result = gcd(num1, num2);

        // Display the result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);

        scanner.close();
    }
}
