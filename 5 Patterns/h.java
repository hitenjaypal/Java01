// 8) Half pyramid using numbers
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

public class h{
   
    public static void main(String[] args) {
      
    
        int n = 6;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j<=i; j++) {     //here j<=i because of inner loop increment for connection to outerloop. we are printing Columns to connect Rows

                // System.out.print(i+" "); // will print different / Printing simply no.ofrows in every line
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
