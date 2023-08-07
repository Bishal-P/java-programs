import java.util.Scanner;

public class reverseOfNumber {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        a=sc.nextInt();
        int rev=0;
        while(a>0){
            int rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        System.out.println("The reverse of the given number is :"+rev);
        sc.close();
    }
}
