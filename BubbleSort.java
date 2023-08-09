public class BubbleSort {
    public static void main(String[] args) {
        int arr[]=new int[]{34,5,3,2,56,24,70};
        int i=0,j=0,flag=0;
        while(i<arr.length-1){
            j=0;
            while(j<arr.length-i-1){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    // flag=0;
                }
                // else{
                //     flag=1;
                // }
                j++;

            }
            // if(flag==1){
            //     break;
            // }
            i++;
        }
        i=0;
        while(i<arr.length){
            System.out.println(arr[i]);
            i++;
        }
    }
}
