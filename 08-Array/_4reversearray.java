public class _4reversearray {
    public static void reverese(int number[]){
        int first=0;
        int last=number.length-1;
        while (first<last) {
            int temp= number[first];
            number[first]= number[last];
            number[last]= temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[]= {1,2,3,4,5,6,7,8,9,0};

        reverese(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]);
        }
    }
}
