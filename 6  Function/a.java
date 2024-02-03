//1) Write a Program to Display Prime Numbers Between Two Intervals (entered by the user) Using Functions

import java.util.*;

public class a {

    public static boolean PrimeInterval (int n){
           // Function to check if a number is prime

        if (n<=1)
        {
            return false;
        }
        
        for(int i =2; i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start, end;

        System.out.println("Enter two number:");
        start = scanner.nextInt();
        end = scanner.nextInt();

        // Display prime numbers between the intervals

        System.out.print("Prime numbers between " + start + " and " + end +" are:\n");

        for (int i = start; i <= end; i++) {  // starting se end tk run hoga then last mai sb print krdega // 
            if (PrimeInterval(i)) {   // function call kiya or boolean fn ki loop print krwadi // simple as f
                System.out.print(i + "");
            }
        }

        // System.out.println();
    }




    }
