import java.util.Scanner;

public class vowelsAndConsonent {
    public static void main(String[] args) {
        String str=new String();
        System.out.print("Enter the string :");
        Scanner sc =new Scanner(System.in);
        str=sc.nextLine();
        int cons,vowel,len,i=0,num,spec;
        cons=vowel=num=spec=0;
        str=str.toUpperCase();
        len=str.length();
        while(i<len){
            int val=str.charAt(i);
            if(val==65 || val==69 || val==73 || val==79 || val==85){
                vowel++;
            }
            else if(val>=65 && val<=90){
                cons++;
            }
            else if(val>=48 && val <=57){
                num++;
            }
            else{
                spec++;
            }
            i++;
            
        }
        System.out.println("vowels =="+vowel+" & consonent ="+cons+" & numbers ="+num+" & special ="+spec);

    }
}
