import java.util.Scanner;

public class _3invertedpyramid {
    public static void inverpyramid(int row){
        for(int i=1; i<=row; i++){
            for(int j=1;j<=row-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row : ");
        int row = sc.nextInt();
        inverpyramid(row);
    }
}
