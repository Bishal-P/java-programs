//simple calculator in java without using switch case and if else
import java.io.IOException;
import java.util.Scanner;

class calculator{

    public static void main(String[] args) throws IOException {
        
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :");
        a=sc.nextInt();
        System.out.print("Enter the second number :");
        b=sc.nextInt();
        System.out.print("Enter the operation you want to perform :");
        char operation=sc.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println("The sum of the two numbers is :"+(a+b));
                break;
            case '-':
                System.out.println("The difference of the two numbers is :"+(a-b));
                break;
            case '*':
                System.out.println("The product of the two numbers is :"+(a*b));
                break;
            case '/':
                System.out.println("The division of the two numbers is :"+(a/b));
                break;
            case '%':
                System.out.println("The remainder of the two numbers is :"+(a%b));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        sc.close();
    }
}