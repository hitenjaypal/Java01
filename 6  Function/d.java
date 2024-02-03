//4) Write a Program to Convert Decimal to Binary number manually by creating user-defined functions

public class d {
    public static void decimaltobinary(int decnum){
        int pow=0;
        int binnum=0;
        int actual_dec=decnum;
        while(decnum>0){
            int lastdigit=decnum%2;
            binnum=binnum+(lastdigit*(int)Math.pow(10,pow));
            pow++;
            decnum=decnum/2;
        }
        System.out.println("the binary of the"+actual_dec+"is"+binnum);
    }
    public static void main(String args[]){
    decimaltobinary(8);
    }
}