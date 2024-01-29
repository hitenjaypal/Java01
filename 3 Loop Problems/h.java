// 8) Write a Program to Reverse a given Number N by user


public class h{
    public static void main(String[] args) {
        int n=123;
        int rev =0;

        int lastdigit;

        while(n>0){
            lastdigit = n%10;

            rev = rev*10 + lastdigit;

            n = n/10;
        }
        System.out.println("The Reverse Number is:" + rev);
        
    }
}
