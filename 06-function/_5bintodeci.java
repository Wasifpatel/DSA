import java.util.Scanner;

public class _5bintodeci {
    public static void bin_deci(int binnum){
        int n = binnum;
        int pow=0;
        int decinum=0;
        while (binnum>0) {
            int lastdigit = binnum%10;
            decinum = decinum + lastdigit*(int)Math.pow(2, pow);
            binnum = binnum/10;
            pow++;
        }
        System.out.println("decimal of binary "+n+" is "+decinum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter binary number : ");
        int binnum = sc.nextInt();
        bin_deci(binnum);
    }
}
