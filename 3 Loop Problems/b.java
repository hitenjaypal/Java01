// 2) Write a Program to Find Factorial of a given number N (N is entered by user)

public class b {
    public static void main(String[] args) {
        int i;
        int fact = 1;
        int n = 5;
//logic

        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The Factorial of 5 is:"+ fact);
    }
}
