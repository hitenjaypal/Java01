// 4) Write a Program which accepts coefficients of a quadratic equation from the user and displays the roots
//(both real and complex roots depending upon the discriminant).

import java.util.*;

public class d {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in); 

       System.out.println("Enter the coefficient of a,b,c:");
       double a = sc.nextDouble();
       double b = sc.nextDouble();
       double c = sc.nextDouble();

       double discriminant = b*b -4*a *c;

       if(discriminant>0){
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("Root 1 = " + root1);
        System.out.println("Root 2 = " + root2);
       }
       else if(discriminant==0){
        double root = -b/ (2 * a);
        
    } else {
        double realPart = -b / (2 * a);
        double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
        System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
        System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
    }

    }
}