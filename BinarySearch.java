public class BinarySearch {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        int index=-1,mid,start=0,end=arr.length-1,elem=8;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==elem){
                index=mid;
                break;
            }
            else{
                if(elem>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        if(index==-1)
            System.out.println("Enter the element not found");
        else
            System.out.println("Element found at index :"+index);
    }
}
