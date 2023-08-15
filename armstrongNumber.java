import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        int num,z,i=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        num=sc.nextInt();
        int temp=num;
        z=num;
        while(z>0){
            i++;
            z/=10;
        }
        while(num>0){
            z=num%10;
            int j=i,tempPro=1;
            while(j>0){
                tempPro*=z;
                j--;
            }
            sum+=tempPro;
            num=num/10;
        }
        if(sum==temp)
            System.out.println("The number is an armstrong number");
        else
            System.out.println("The number is not an armstrong number");
    sc.close();
    }
    
}
