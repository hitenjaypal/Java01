//In Java, all function definitions must be inside classes. We also call functions methods

// Access Specifier: Access specifier or modifier is the access type of the method. It specifies the visibility of the method. Java provides four types of access specifier:

// Public: The method is accessible by all classes when we use public specifier in our application.
// Private: When we use a private access specifier, the method is accessible only in the classes in which it is defined.
// Protected: When we use protected access specifier, the method is accessible within the same package or subclasses in a different package.
// Default: When we do not use any access specifier in the method declaration, Java uses default access specifier by default. It is visible only from the same package only.


// public class Main {
//     public static void foo() {
//          Do something here
//     }
// }


//void function and its call
//Write a function to calculate average of three numbers

public class function_average {
    public static void average(int a , int b, int c){
        int average=(a+b+c)/3;
        
        System.out.println(average);
        
    }
    public static void main(String args[]){
    average(10,10,10);
    }
}


//int function and its call
public class AverageCalculator {
    public static int calculateAverage(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        int average = sum / 3;
        return average;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int avg = calculateAverage(num1, num2, num3);

        System.out.println("Average of the three numbers is: " + avg);
    }
}
