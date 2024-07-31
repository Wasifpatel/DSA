import java.util.Scanner;

public class _6dectobin {
    public static void dec_bin(int decinum){
        int n = decinum;
        int pow=0;
        int binnum=0;
        while (decinum>0) {
            int rem = decinum%2;
            binnum = binnum + (rem*(int)Math.pow(10, pow));
            pow++;
            decinum = decinum/2;
        }
        System.out.println("binary of decimal "+n+" is "+binnum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter decimal number : ");
        int decinum = sc.nextInt();
        dec_bin(decinum);
    }
}
