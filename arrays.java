import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int i=0;
        Scanner sc = new Scanner(System.in);
        while(i<10){
            System.out.print("Enter the value of "+i+"th element :");
            arr[i]=sc.nextInt();
            i++;
        }
        sc.close();
        i=0;
        System.out.print("The entered array is :");
        while(i<10){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
    }
}
