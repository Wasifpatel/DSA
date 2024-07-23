import java.util.Scanner;

public class _4charpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of lines : ");
        int num = sc.nextInt();
        char ch = 'A';
        
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
