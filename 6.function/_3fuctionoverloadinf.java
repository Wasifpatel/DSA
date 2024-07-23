public class _3fuctionoverloadinf {

    public static int addition(int a ,int b){
        return a+b;
    }
    public static float addition(float a ,float b){
        return a+b;
    }
    public static int addition(int a ,int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(addition(4,5));
        System.out.println(addition(3.2f,4.8f));
        System.out.println(addition(3,4,5));
    }
}
