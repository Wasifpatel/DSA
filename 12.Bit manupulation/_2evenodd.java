public class _2evenodd {
    public static void evenodd(int n) {
        int bitmask =1;
        if((n & bitmask)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
    public static void main(String[] args) {
        evenodd(3);
        evenodd(7);
        evenodd(8);
    }
}
