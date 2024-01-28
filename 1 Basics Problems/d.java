// 4) Write a program where the user is asked to enter two integers (divisor and dividend) &
//the quotient and the remainder of their division is computed.(Both divisor and dividend should be integers.)
import java.util.*;

public class d {
    public static void main(String[] args) {
        int q;
        int r;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter divisor:");
        int d = sc.nextInt();
        System.out.println("Enter dividend:");
        int e = sc.nextInt();
        if(d==0){
            System.out.println("Enter a Valid Divisor");
        }
        else{
          q=e/d; 
          System.out.println("Quotient is:" + q);
          r=e%d;
          System.out.println("Remainder is :" +r);

        }
    }
}