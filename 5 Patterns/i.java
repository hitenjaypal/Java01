// 9) Pascal Triangle

//  1
//  1 1
//  1 2 1
//  1 3 3 1
//  1 4 6 4 1

public class i {
    public static void main(String[] args) {

        // Variable Declared
        int n = 5; // Has given Different Name for inner loop j --> Space

        // Outer Loop
        for (int i = 0; i < n; i++) {


            // For Space

            // for (int space = n; space > i; space--)
                       // OR
            for (int j = 0; j < n - i - 1; j++) {  // n-i-1 => 5-0-1=4 => 5-1-1=3 => 2 => 1
                System.out.print(" ");
            }

            // For Numbers
            // Logic

            int num = 1;
            for (int j = 0; j <= i; j++) { 
                System.out.print(num + " ");
                //main logic (Remember) 
                num = num * (i - j) / (j + 1); 
            }

            System.out.print("\n");
        }
    }
}