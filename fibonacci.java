
class fibonacci{
    public static void main(String[] args) {
        int first=0,second=1,third,i=2;
        System.out.print(first+" "+second+" ");
        int length=10;
        while(i<length){
            System.out.print(first+second+" ");
            third=first;
            first=second;
            second=third+second;
            
            i++;

        }
    }
}