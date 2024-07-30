public class _4clearbits {
    public static int clearbits(int n, int i) {
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int clearrange(int n, int i, int j) {
        int a= (~0)<<(j+1);
        int b= (1<<i)-1;
        int bitmask =a | b;
        return n & bitmask;

    }

    
    public static void main(String[] args) {
        
        System.out.println(clearbits(15, 2));
        System.out.println(clearrange(15, 2,3));
    }
}
