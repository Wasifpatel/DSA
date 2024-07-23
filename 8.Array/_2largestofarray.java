public class _2largestofarray {
    public static int largest(int number[]) {
        int big=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(number[i]>big){
                big=number[i];
            }
        }
        return big;
    }
    public static void main(String[] args) {
        int number[]= {1,2,3,4,5,6,7,8,9,0};

        System.out.println("largest value is : "+largest(number));
    }
}
