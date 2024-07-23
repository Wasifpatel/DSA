import java.util.Scanner;

public class _4isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num : ");
        int num = sc.nextInt();
        boolean flag = true;

        if (num == 2) {
            System.out.println("number is a prime");
        }
        else{
            for(int i=2;i<Math.sqrt(num);i++){
                if(num%i==0){
                    flag= false;
                }
            }
            if(flag==false){
                System.out.println("number is not a prime");
            }
            else{
                System.out.println("number is a prime");
            }
        }
    }
}
