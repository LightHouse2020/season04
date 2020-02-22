
//题目：输入10 个数，并进行排序 。

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

public class program7 {
	public static void main(String[] args) {
		double[] array=new double[10];
		System.out.print("请输入十个数字：");
		for(int i=0;i<10;i++) {
			Scanner input_num = new Scanner(System.in);
			array[i] = input_num.nextDouble();
		}
		System.out.println(" ");
		System.out.println("排序前数组为：");
		for(int i=0;i<array.length;i++){
		      System.out.print(array[i]+" ");
		}
		System.out.println("\n");
		
		//冒泡排序
		double temp;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[i]<array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
				
			}
		}
		System.out.println("排序后数组为：");
		for(int i=0;i<array.length;i++){
		      System.out.print(array[i]+" ");
		}
	}
}
