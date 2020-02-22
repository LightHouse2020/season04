
//题目2：有一分数序列：
//2/1 3/2 5/3 8/5 13/8 21/13... 求出这个数列的前 20 项之和。

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
