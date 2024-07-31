public class _3operations {
    // to check 0 or 1
    public static int getoperation(int n, int i) {
        int bitmask = 1<<i;
        if((n &bitmask)== 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    // to convert 0 to 1
    public static int setoperation(int n, int i) {
        int bitmask = 1<<i;
        return n | bitmask;
    }
    // to convert 1 to 0
    public static int clearoperation(int n, int i) {  
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    // to update ith bit
    public static int updateoperation(int n, int i, int newbit){
        // if(newbit ==0 ){
        //     return clearoperation(n, i);
        // }
        // else{
        //     return setoperation(n, i);
        // }
        n = clearoperation(n, i);
        int bitmask = newbit<<i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        
        System.out.println(getoperation(10, 2));
        System.out.println(setoperation(10, 2));
        System.out.println(clearoperation(10, 2));
        System.out.println(updateoperation(10, 2 ,1));
    }
}
