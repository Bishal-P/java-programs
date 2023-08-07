import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int a,fact=1;
        System.out.print("Enter the nummber :");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        while(a>0){
            fact=fact*a;
            a--;
        }
        System.out.println("The factorial of the number is "+((a<0)?("not possilble"):(fact)));
        sc.close();
    }
}
