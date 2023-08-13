public class reverseEachWordOfSentence {

    static String reverse(String str){
        String temp="";
        for(int i=str.length()-1;i>=0;i--){
            String a=Character.toString(str.charAt(i));
            temp=temp.concat(a);

        }
        return temp;

    }
    public static void main(String[] args) {
        String sentence="Helo my name is khan";
        String reversedSentence="";
        int word=0,prev=0;
        System.out.println(reverse(sentence.substring(0, 6)));
        for(int i=1;i<sentence.length()-1;i++){
            if(sentence.charAt(i-1)==' ' && sentence.charAt(i)!=' '){
                prev=i;
            }
            else if(sentence.charAt(i+1)==' '){
                word=i+1;
                reversedSentence=reversedSentence.concat(reverse(sentence.substring(prev, word)))+" ";
            }

        }
        reversedSentence=reversedSentence.concat(reverse(sentence.substring(prev)));
        System.out.println(reversedSentence);
        
    }
}
