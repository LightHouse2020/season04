
//题目5：从键盘输入一个不多于5位的正整数。 要求：一、求它是几位数，二、逆序打印出各位数字。

import java.util.Scanner;

public class program5 {
	public static void main(String[] args) {
		double num;
		//判断输入的数字是否符合标准
		do {
			System.out.print("请输入一个不多于五位的正整数：");
			Scanner input_num = new Scanner(System.in);
			num = input_num.nextInt();
			if (num <= 0 || num > 99999) {
				System.out.print("输入的数不符合要求，请重新输入:");
				num = input_num.nextInt();
			}
		}while (num <= 0 || num > 99999); 
		
		//判断输入的数字是几位数，逆序打印出各位数字
		int count, num_digit, temp;
		if (num < 10){
			count = 1;
		}
		else {
			count = 0;
			System.out.print("它的逆序各位数依次是：");
			do{
				num = num / 10;
				count++;
				temp = (int)num;
				num_digit = (int)((num - temp)*10);
				System.out.print(num_digit);
			}while(num > 1);
		}
		System.out.println("");
		System.out.println("它是一个"+count+"位数");
	}
}
