import java.util.Scanner;

public class _1largestnum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt(); 
        System.out.println("enter b : ");
        int b = sc.nextInt();
        System.out.println("enter c : ");
        int c = sc.nextInt();

        if (a>=b && a>=c) {
            System.out.println("a is largest");
        }
        else if (b>=c ) {
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }


    }
}
