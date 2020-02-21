package com.company;

public class program4 {
    public static void main(String[] args){
        int[] a=new int[5];
        a[0]=10;
        for(int i=1;i<=4;i++){
            a[i]=a[i-1]+2;
        }
        System.out.println(a[4]);
    }
}
