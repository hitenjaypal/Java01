//5) Write a Program to Find Size of int, float, double and char in your computer

public class e {
    public static void main(String[] args) {
        
        //Formula [Datatypes.SIZE/8  (8 stands for 8 bytes)]
        
        System.out.println("Size of int: " + Integer.SIZE/8);    
        System.out.println("Size of float: " + Float.SIZE/8);
        System.out.println("Size of double: " + Double.SIZE/8);
        System.out.println("Size of char: " + Character.SIZE/8);

        
    }
}