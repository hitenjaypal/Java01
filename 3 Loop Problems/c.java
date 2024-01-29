// 3) Write a Program to Generate Multiplication Table of a number (entered by the user) using a for loop.

import java.util.*;

public class c{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
int i;
        
          for (i=1;i<=10;i++){
          System.out.println(n + "x" + i + "=" + (n*i) );

          }
    }
}
