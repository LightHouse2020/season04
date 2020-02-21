package 凌志栋;

import java.util.Scanner;

public class program7 {
    public static void main(String[] args){
       //create a list for 10 data
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("input the No."+i+" number: ");
            a[i]=sc.nextInt();
        }
        selectSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        }
    public static void selectSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i+1; j <arr.length ;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(min!=i){
                swap(arr, i, min);
            }
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

