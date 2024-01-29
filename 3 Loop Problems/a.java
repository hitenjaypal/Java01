// 1) Write a Program to Calculate Sum of first N Natural Numbers (here value of N is Entered by user)

import java.util.*;
 public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        //logic

        int sum = 0;
        int i;
        for(i=1;i<=n;i++){
            sum= sum+i;
        }
        System.out.println("The sum of First "+  n  + "natural numbers is:" +sum);
    }
 }