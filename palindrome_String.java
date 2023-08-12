import java.util.Scanner;

public class palindrome_String {
    public static void main(String[] args) {
        String str=new String();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        str=sc.nextLine();
        boolean palindrome=true;
        int len=str.length();
        for (int i=0;i<len/2;i++){
            if(str.charAt(i)==str.charAt(len-1-i)){
                continue;
            }
            palindrome=false;
            System.out.println("Not a plaindrome string");
            break;
        }
        if(palindrome){
            System.out.println("The string is a palindrome string");
        }
        sc.close();
    }
}
