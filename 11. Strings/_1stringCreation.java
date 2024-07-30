import java.util.*;

public class _1stringCreation{

    public static void printChar(String name) {
        
    }
    public static void main(String[] args) {
        String str = "abcd";
        String str2 = new String("1234");

        // string input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        // stringlength
        System.out.println(name.length());
        
        //concatination
        String fullname = name + str;
        System.out.println(fullname);

        // indexing
        System.out.print(name.charAt(5));

        
    }
}