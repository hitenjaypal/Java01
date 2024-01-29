// 5) Write a Program to Display Fibonacci Series upto
// certain number n (n is entered by user)
// Example: n=100
// Output:
// Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,

import java.util.*;

public class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();

        int n1=0;
        int n2=1;
        int i , n3;
// just focus on how iteration runs do DRY run
        while (n1<=n) { // n1 print hoga jbtk uski value n se choti ya equal na ho // simple logic
            System.out.println(n1 + " ");

            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    
    }
}