public class _3binarysearch {
    public static int binary(int number[], int key){
        int start=0;
        int end = number.length-1;
        while (start<=end) {
            int mid = (start+end)/2;

            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start = mid+1;
            }
            if(number[mid]>key){
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]= {1,2,3,4,5,6,7,8,9};
        int key=9;

        int index= binary(number,key);
        if(index== -1){
            System.out.print("not found");
        }
        else{
            System.out.print("number found at index : "+index);
        }

    }
}
