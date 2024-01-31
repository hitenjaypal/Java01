// 6) Inverted Full pyramid
// * * * * * *
//  * * * * *
//  * * * *
//  * * *
//  * *
//  *

public class f {
    public static void main(String[] args) {
        int rows = 6;

        // Outer loop for rows
        for (int i = rows; i >= 1; i--) {


            // Inner loop for printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Inner loop for printing stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}

// public class f {

//     public static void Revpyramid(int n) {

//         // for outer loop
//         for (int i = 0; i < n; i++) {        

//             // for space
//             for (int j =0; j<=i; j++)              // j<=i logic-- j row no.(i) ke sath increase hoga 
//         {
//             System.out.print(" ");
//         }

//             // for star
//             for(int j=0;j< 2*n-(2*i+1);j++){        // 2*n-(2*i+1) logic bngea eg- 10-1=9
            
//                 System.out.print("*");
//             }

//             // for space
//             for (int j =0; j<=i; j++)              // j<=i logic-- j row no.(i) ke sath increase hoga    
//         {
//             System.out.print(" ");
//         }

//             System.out.println();

//         }
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         Revpyramid(n);
//     }

}
