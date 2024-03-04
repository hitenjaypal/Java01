// 2) Write a Program to check if an integer (entered by the user)
// can be expressed as the sum of two prime numbers,if yes then
// print all possible combinations with the use of functions
// Example
// Enter a positive integer: 34
// OUTPUT:
// 34 = 3 + 31
// 34 = 5 + 29
// 34 = 11 + 23
// 34 = 17 + 17

import java.util.Scanner;

public class b {

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print all combinations of prime numbers adding up to n
    static void printPrimeSum(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a positive integer from the user
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        // Check and print all combinations of prime numbers adding up to num
        System.out.println("OUTPUT:");
        printPrimeSum(num);

        scanner.close();
    }
}
