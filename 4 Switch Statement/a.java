// 1) Write a Program to Make a Simple Calculator to Add, Subtract,Multiply or Divide Using Switch case .
// The program should takes an arithmetic operator (+, -,*, /) and two operands from a user
// and performs the operation on those two operands depending upon the operator entered by the user.

// switch(expression) {
//     case x:
//       // code block
//       break;
//     case y:
//       // code block
//       break;
//     default:
//       // code block
//   }


import java.util.*;

public class a{
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        //declare
        int  num1,num2;
        int result;

        //pre printing // intialize 
        System.out.println("Chose an Operator: +,-,* or /");
        char operator = sc.next().charAt(0);

        System.out.println("Enter First Number:"); 
        num1=sc.nextInt();    // we can also use long/double/float 

        System.out.println("Enter Second Number:");
        num2=sc.nextInt();

        //logic

        switch(operator){

            case '+':
           result= num1+num2;
            System.out.println(result);
            break;

            case '-':
           result= num1-num2;
            System.out.println(result);
            break;

            case '*':
           result= num1*num2;
            System.out.println(result);
            break;

            case '/':
           result= num1/num2;
            System.out.println(result);
            break;

            default:
            System.out.println("Invalid Operator");
            break;


        }

    }
}