package 凌志栋;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        System.out.println("input n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] a=new int[n+1];
        a[n]=1;
        for(int i=9;i>=0;i--){
            a[i]=2*(a[i+1]+1);
        }
        System.out.println(a[0]);
    }
}
