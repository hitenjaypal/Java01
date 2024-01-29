// 6) Write a Program to Find GCD or HCF of two numbers entered by user

import java.util.*;

public class f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number:");
        int num2 = sc.nextInt();

        // logic

        int ans = 1; // update hota rhega jese loop run hogi // abhi sbka ans 1 toh hota hi hai isiliye apne ne daala 

        for (int i = 1; i <= Math.min(num1, num2); i++) { // min tk chlega  (Math.min) kyuki aage chlkr koi fyda nai
            if (num1 % i == 0 && num2 % i == 0) { // last mai one toh aata hai
                ans = i;
            }

        }
        System.out.println("The gcd of two number is " + ans);
    }
}