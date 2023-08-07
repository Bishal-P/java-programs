import java.util.Scanner;

public class greaterOfThreeNumbers {
    public static void main(String[] args) {
        int a,b,c;
        a=50000;
        b=609;
        c=70;
        if(a>b){
            if(a>c){
                System.out.println("The greatest number is :"+a);
            }
        }
        else if(b>a){
            if(b>c){
                System.out.println("The greatest number is :"+b);
            }
            else{
                System.out.println("The greatest number is :"+c);
            }
        }
    }
}
