import java.util.Scanner;

public class ShortName {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String shortname="";
        String name="shiv kumar Prasad";
        System.out.print("Enter Your name :");
        name=sc.nextLine();
        int flag=0,surname=0;
        for(int i=name.length()-1;i>0;i--){
            if(flag==1 && name.charAt(i-1)==' '){
                surname=i;;
                break;
            }
            if(name.charAt(i)!=' '){
                flag=1;
            }
        }
        for (int i=1;i<surname;i++){
            if(i-1==0 && name.charAt(0)!=' '){
                String val= Character.toString(name.charAt(0))+". ";
                shortname=shortname.concat(val);    
            }
            else if(name.charAt(i-1)==' ' && name.charAt(i)!=' '){
                String val=Character.toString(name.charAt(i))+". ";
                shortname=shortname.concat(val);
            }
            
        }
        sc.close();
        shortname=shortname.concat(name.substring(surname));
        System.out.println("The shortname is "+shortname);
    }
}
