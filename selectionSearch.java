class selectionSearch{
    public static void main(String[] args) {
        int arr[]=new int[]{9,7,5,3,63,6,2};
        int len=arr.length-1;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int i=0;
        while(i<=len){
            System.out.println(arr[i]);
            i++;
        }
    }
}