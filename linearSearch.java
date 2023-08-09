public class linearSearch {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,0};
        int elem=0,len=arr.length,i=0;
        while (i<len){
            if(arr[i]==elem){
                break;
            }
            else{
                i++;
            }
        }
        if(i<=len-1){
            System.out.println("Element found at position :"+i);
        }
        else{
            System.out.println("Element not found");
        }
        

        

    }
}
