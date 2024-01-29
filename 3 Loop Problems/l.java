// 12) Write a Program to Check Whether a Number N entered by user is Palindrome or Not

import java.util.*;
public class l {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the Number:");
        int n= sc.nextInt();

        int duplicate = n;
        int rev = 0;
        int lastdigit;
        

// logic
        do {
            lastdigit = n % 10;
            rev = (rev *10)+ lastdigit;
            n = n/ 10;
            
        }while (n>0);

        // printing

        if(duplicate == rev){
            System.out.print( "The number "+ duplicate +" is a palindrome number");
        } else{
            System.out.print("The number "+ duplicate +" is not a palindrome number");
        }



    }
}