import java.util.Scanner;

public class _3reversenum {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter num : ");
    //     int num = sc.nextInt();

    //     while (num>0) {
    //         int lastdigit = num%10;
    //         System.out.print(lastdigit);
    //         num/=10;
    //     }
    // }

    // ********************************************************************
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num : ");
        int num = sc.nextInt();
        int rev = 0;
        while (num>0) {
            int lastdigit = num%10;
            rev = (rev*10)+lastdigit;
            num/=10;
        }
        System.out.print(rev);
    }
}


