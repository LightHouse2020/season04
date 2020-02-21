package 凌志栋;
import java.io.*;

public class program5 {
    public static void main(String[] args) throws IOException{
        String num;
        System.out.println("input a integer: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num=br.readLine();

        char[] a=new char[num.length()];
        a=num.toCharArray();
        System.out.println("");
        for(int i=num.length()-1;i>=0;i--){
            System.out.println(a[i]+" ");
        }
        System.out.println(num.length());

    }


}
