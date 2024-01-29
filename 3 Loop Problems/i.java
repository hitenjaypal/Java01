// 9) Write a Program to display sum of all digits of a givenm Number N by user

import java.util.*;
public class i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();


        int sum=0;
        int remainder;

         while (n != 0){

           remainder = n%10; // 
           sum = sum+remainder;
            n= n/10;   // Update n by removing its last digit (by integer division by 10).
    }

    System.out.println("The sum of all digit is:" + sum);
}
}