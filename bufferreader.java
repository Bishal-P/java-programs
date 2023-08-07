import java.io.*;

class bufferreader{

    public static void main(String args[])throws IOException{
        String name;
        System.out.print("Enter you name :");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        name=br.readLine();
        System.out.println("Hello "+name);
    }
}