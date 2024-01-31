// 4) Inverted Half pyramid
// * * * * * *
// * * * * *
// * * * *
// * * *
// * *
// *


public class d {
    public static void main(String[] args) {
        int n = 5;
    

        for (int i = 0; i <= n; i++) {

            for (int j =n; j>i; j--) {
            // for (int j =0; j>n-i+1; j++) { // (row-n)+1


                System.out.print("* ");
            }
            System.out.println();
        }
    }
}