import java.util.Scanner;

public class _4calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt(); 
        System.out.println("enter b : ");
        int b = sc.nextInt();
        System.out.println("enter operation : ");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("a+b = "+(a+b));
                break;
            case '-':
                System.out.println("a-b = "+(a-b));
                break;
            case '*':
                System.out.println("a*b = "+(a*b));
                break;
            case '/':
                System.out.println("a/b = "+(a/b));
                break;
            case '%':
                System.out.println("a%b = "+(a%b));
                break;
        
            default:
            System.out.println("wrong operator ");
                break;
        }

        
    }   
}
