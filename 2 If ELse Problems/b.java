// 2) Write a Program to Check Whether a Character is Vowel or Consonant.

import java.util.*;

public class b {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter a character: ");
     char ch = sc.next().charAt(0);
// || 
     if (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' ||ch =='E' ||ch =='I' ||ch =='O' ||ch =='U'){
        System.out.println("The entered character is vowel");
     } else{
        System.out.println("The entered character is consonant");
        }
     }
    }
