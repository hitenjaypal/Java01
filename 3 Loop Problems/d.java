//4) Write a Program to Display Fibonacci Series upto nth term (n is entered by user)

import java.util.*;

public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
// logic
        int n1=0;  // after update n1=1 // then n1=1
        int n2=1;  // after update n2=1 // then n2=2
        int n3,i; 
        
        for(i=2;i<n;++i){ //loop starts from 2 because 0 and 1 are already printed    


            // just focus on how iteration runs do DRY run

            n3=n1+n2;  // after update n3=2 // then  n3=3
            System.out.println(""+n3);   //  Print the next term of the Fibonacci series.
            n1=n2;    //  Update n1 to the value of n2 for the next iteration.
            n2=n3;    // Update n2 to the value of n3 for the next iteration

        }

    }
}