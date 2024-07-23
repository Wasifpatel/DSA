import java.util.*;

public class _1arithmatic {
    public static void main(String[] args) {
        int a= 5;
        int b= 5;

        int sum= a+b;
        int sub= a-b;
        int mul= a*b;
        int div= a/b;
        int modulo = a%b;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(modulo);

        a= ++a;
        System.out.println("pre-increment = "+ a);
        a= a++;
        System.out.println("post-increment = "+ a);
    }
}
