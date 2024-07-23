import java.util.*;

public class _1printnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num : ");
        int num = sc.nextInt(); 
        int counter = 1;

        while (num>=counter) {
            System.out.print(counter +" "); 
            counter++;
        }

    }
}
