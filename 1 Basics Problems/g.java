//7) Write a Program to Find ASCII Value of a Character
//A character variable holds ASCII value (an integer number between 0 and 127) rather than that character itself in C programming. That value is known as ASCII value.
//For example, the ASCII value of 'A' is 65 /'a' is 97. What this means is that, if you assign 'A' to a character variable, 65 is stored in that variable rather than 'A' itself.

import java.util.*;

public class g {
    char fuck; // global variable // if we dont want to write here then we can do cause it not generate error

    public static void main(String[] args) {
        // char fuck; // local variable we can't declared it here because it already declared in input format
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character:");
        char fuck = sc.next().charAt(0);  // remember it 

        // logic
        // We have done Type Casting
        // In Java, type casting is a method or process that converts a data type into another data type in both ways manually and automatically.
        int ASCII = (int) fuck;  // int ko type cast kiya kyuki answer int mai aayga 

        System.out.println("The ASCII value of char is:" + ASCII);

    }
}