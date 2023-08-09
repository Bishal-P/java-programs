public class insertionSort {
    public static void main(String[] args) {
        int arr[]=new int[]{34,5,3,2,56,24,70};
        int temp,res=0;
        for(int i=0;i<arr.length-1;i++){
            temp=arr[i+1];
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int a=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=a;
                }
                else{
                    res=j;
                    break;
                }
            }
            arr[res]=temp;

        }
        temp=0;
        while(temp<arr.length){
            System.out.println(arr[temp]);
            temp++;
        }
    }
}
