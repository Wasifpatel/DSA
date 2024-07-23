import java.util.Scanner;

public class _2invertedstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of lines : ");
        int num = sc.nextInt();
        
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
