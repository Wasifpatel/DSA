import java.util.*;

public class _1hollowsquar {
    public static void hollowsqr(int row, int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || j==1 || i==row || j==col ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row : ");
        int row = sc.nextInt();
        System.out.print("enter col : ");
        int col = sc.nextInt();
        hollowsqr(row, col);
    }
}
