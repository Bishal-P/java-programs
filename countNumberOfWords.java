import java.util.Scanner;

public class countNumberOfWords {
    public static void main(String[] args) {
        String str=new String();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence :");
        str=sc.nextLine();
        int words=0;
        char  ch=' ';
        if (str.length()==1){
            words++;
        }
        for(int i=1;i<str.length();i++){
                ch=str.charAt(i);
                if(i==1 && str.charAt(1)!=' '){
                    words++;
                }
                else if(ch!=' ' && str.charAt(i-1)==' '){
                    words++;
                }

        }
        System.out.println("the number of words are "+words);
        sc.close();
    }
}
