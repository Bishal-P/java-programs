import java.util.Scanner;

public class primeNumberOrNot {
    public static void main(String[] args) {
        int a,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        a=sc.nextInt();
        if(a<2){
            flag=1;
        }
        else{
            int i=2;
        while(i<a){
            if(a%i==0){
                flag=1;
                break;
            }
            i++;
        }
        
        }
        if(flag==1){
            System.out.println("The number is not prime ");
        }
        else
          System.out.println("The number is prime");
    sc.close();
        }
    
}
