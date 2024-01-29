// 10) Write a Program to Calculate Power of a Number using inbuilt pow() function by taking two inputs from users as Base and exponent respectively

import java.util.*;
public class j {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the Base:");
        double x= sc.nextInt();

        System.out.println("Enter the Exponent:");
        double n = sc.nextInt();

        //using loops 

        if(n<0){
            System.out.println("Enter positive Integer");
        }

        double result = 1;
        for ( int i=0; i<n;i++){  // exponent jitna higa utne time iteration hoga or ru hogi the result ki value change hoti rhegi and at last write answ aajyga 
            result = result * x;

        }






        //simple method
        // double result = Math.pow(x, n);

        // System.out.println(result);

    }
}

// Type conversion is used // lossey conversion concept cleared here 