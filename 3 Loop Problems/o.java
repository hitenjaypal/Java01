// 15) Write a Program to check whether a number entered by the user is an Armstrong number or not.

public class o {
    public static void main(String[] args) {
        
    
    
    int n = 153;
    int temp = n;

    int sum = 0;
  


    while (n>0){
        int r = n % 10;
        sum = sum + r*r*r;  // 27+125+1--153
        n = n/10;
        

    }

    if(temp==sum){
        System.out.println("The number is an Armstrong number");
     }else{
        System.out.println("The number is not an Armstrong number");

        }
    }
}
    

