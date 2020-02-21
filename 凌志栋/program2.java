package 凌志栋;

import java.util.Scanner;

public class program2 {

    public static void main(String[] args) {

        //input a1
        double x,y;
        System.out.println("input x of x/y");
        Scanner sc=new Scanner(System.in);
        x=sc.nextDouble();
        System.out.println("input y of x/y");
        Scanner sr=new Scanner(System.in);
        y=sc.nextDouble();

        //create a new list
        double[] List = new double[20];
        List[0]=x/y;

        //calculate a2~a20
        recursive(20,x,y,List);
       //calculate sum and print each element
        double sum=0.0;
        for(int i=0;i<20;i++){
            System.out.println("No."+i+"= "+List[i]+"\n");
            sum+=List[i];
        }
        System.out.println("Sum= "+sum+"\n");
    }
    public static void recursive(int n,double x,double y,double List[]){
        for(int i=1;i<n;i++){
            double tmp=x;
            x=x+y;
            y=tmp;
            List[i]=x/y;
        }
    }
}
