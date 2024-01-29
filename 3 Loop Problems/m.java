// 13) Write a Program to Check Whether a Number is Prime or Not

import java.util.*;

public class m {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        // logic

        if (n == 2) { // kyuki 2 se start kia 1 se ani krskte

            System.out.println("The number is prime");
        } else {

            // boolean ease logic

            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) { // we can also use i<=n-2 but it require more space so time comp
                                                      // will affect n=sqrtn*sqrtn

                if (n % i == 0) { // if n is a multiple of i (i not equal to 1 or n)
                    isPrime = false;

                }
            }


            // printing
            if (isPrime == true) {
                System.out.println("The number is prime");
            } else {
                System.out.println("The number is not prime");
            }
        }

    }

}
