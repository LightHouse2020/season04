
//��Ŀ2����һ�������У�
//2/1 3/2 5/3 8/5 13/8 21/13... ���������е�ǰ 20 ��֮�͡�

public class program2 {
	public static void main(String[] args) {
		float a=2,b=1,temp,sum=0;
		for(int i=1;i<=20;i++) {
			sum += a/b;
			temp = a;
			a= a+b;
			b = temp; 
		}
		System.out.println("sum = "+sum);
	}

}
