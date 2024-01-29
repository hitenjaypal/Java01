// 16) Write a Program to Display all Factors of a Number entered by User

import java.util.*;

public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        System.out.println("Factors of  " + n + " are : ");
    
//logic
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
}
}