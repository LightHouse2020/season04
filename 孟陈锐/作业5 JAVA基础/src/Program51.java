import java.util.Scanner;

public class Program51 {

	static Integer num;
	public static void main(String[] args) {

		System.out.print("请输入一个不多于五位的正整数：");
		Scanner input_num = new Scanner(System.in);
		num = input_num.nextInt();
		if(checkFiveNum(num)) {
			String result =num.toString();
			char []cArray=result.toCharArray();
			for(int i=0;i<cArray.length;i++) {
				System.out.println(cArray[cArray.length-1-i]);
			}
		}
	}

	static boolean checkFiveNum(Integer param1) {
		String regex="\\d{5}";
		return param1.toString().matches(regex);
	}
}
