import java.util.Scanner;

public class _4primerange {

    public static boolean isprime(int n){
        if (n == 2) {
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeinrange(int n){
       for(int i=2; i<=n; i++){
            if(isprime(i)){
                System.out.print(i+" "); 
            }
        }
       System.out.println(); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        
        primeinrange(n);
    }
}
