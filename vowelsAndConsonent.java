public class vowelsAndConsonent {
    public static void main(String[] args) {
        String str="aeiou";
        int cons,vowel,len,i=0,num;
        cons=vowel=num=0;
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
            i++;
            
        }
        System.out.println("vowels =="+vowel+" & consonent ="+cons+" & numbers ="+num);

    }
}
