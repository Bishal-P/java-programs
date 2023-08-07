import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        a=sc.nextInt();
        int sum=0;
        while(a>0){
            int rem=a%10;
            sum+=rem;
            a=a/10;
        }
        System.out.println("The reverse of the given number is :"+sum);
        sc.close();
    }
}
