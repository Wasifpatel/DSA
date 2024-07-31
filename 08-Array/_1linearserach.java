public class _1linearserach{
    public static int search(int number[],int key){
        for(int i=0; i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]= {1,2,3,4,5,6,7,8,9,0};
        int key = 7;

        int index= search(number,key);
        if(index== -1){
            System.out.print("not found");
        }
        else{
            System.out.print("number found at index : "+index);
        }
    }
}