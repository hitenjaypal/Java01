// 3) Write a Program to Find Largest Number Among Three Numbers entered by users
import java.util.*;

public class c{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a= sc.nextInt();
        System.out.println("Enter the second number:");
        int b= sc.nextInt();
        System.out.println("Enter the three number:");
        int c= sc.nextInt();

        if(a>b || a>c){
            System.out.println("a is larger number among three");
        }
        else if (b>a || b>c){
            System.out.println("b is larger number among three");
        }
        else{
            System.out.println("c is larger number among three");
        }

    }
}
