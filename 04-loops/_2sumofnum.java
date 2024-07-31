import java.util.Scanner;

public class _2sumofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num : ");
        int num = sc.nextInt();
        int i = 1; 
        int sum=0;

        while (i<=num) {
            sum+=i;
            i++;
        }
        System.out.println("sum numbers upto "+num+" is : "+ sum);
    }
}
