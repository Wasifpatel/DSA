import java.util.Scanner;

public class _4floydsTriangle {
    public static void floyd(int row){
        int counter=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row : ");
        int row = sc.nextInt();
        floyd(row);
    }
}
