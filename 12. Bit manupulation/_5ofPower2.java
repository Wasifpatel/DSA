public class _5ofPower2 {
    public static boolean ofpower2(int n) {
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        
        System.out.println(ofpower2(2));
    }
}
