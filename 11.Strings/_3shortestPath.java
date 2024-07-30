public class _3shortestPath {

    public static float getshortestpath(String path)  {
        int x=0 , y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        return (float)Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println(getshortestpath(path));

        // ********************************************************
        // INTERNING CONCEPT
        String s1 ="Tony";
        String s2 ="Tony";
        String s3 = new String("Tony");

        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1==s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

    }
}
