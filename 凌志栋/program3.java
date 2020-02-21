package 凌志栋;

import java.io.IOException;
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) throws IOException {
       System.out.println("input an integer x: ");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The result is "+factorial(a));
    }
    //calculate factorial x!
    public static double factorial(int n){
        double b=1;
        for(int i=1;i<=n;i++){
            b=b*i;
        }
        return b;
    }
}
