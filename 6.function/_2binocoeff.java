import java.util.Scanner;

public class _2binocoeff {
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }

    public static int binomial(int n,int r){
        int fact_n =factorial(n);
        int fact_r =factorial(r);
        int fact_nmr =factorial(n-r);

        int bino = fact_n / (fact_r * fact_nmr);
        return bino;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        System.out.println("enter r : ");
        int r = sc.nextInt();
        System.out.println(binomial(n,r));
    }
}
