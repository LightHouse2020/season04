
//��Ŀ5���Ӽ�������һ��������5λ���������� Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�

import java.util.Scanner;

public class program5 {
	public static void main(String[] args) {
		double num;
		//�ж�����������Ƿ���ϱ�׼
		do {
			System.out.print("������һ����������λ����������");
			Scanner input_num = new Scanner(System.in);
			num = input_num.nextInt();
			if (num <= 0 || num > 99999) {
				System.out.print("�������������Ҫ������������:");
				num = input_num.nextInt();
			}
		}while (num <= 0 || num > 99999); 
		
		//�ж�����������Ǽ�λ���������ӡ����λ����
		int count, num_digit, temp;
		if (num < 10){
			count = 1;
		}
		else {
			count = 0;
			System.out.print("���������λ�������ǣ�");
			do{
				num = num / 10;
				count++;
				temp = (int)num;
				num_digit = (int)((num - temp)*10);
				System.out.print(num_digit);
			}while(num > 1);
		}
		System.out.println("");
		System.out.println("����һ��"+count+"λ��");
	}
}
