
//题目4：题目：有5 个人坐在一起，问第五个人多少岁？他说比第 4 个人大 2 岁。
//问第 4 个人岁数，他说比第 3 个人大 2 岁。问第三个人，又说比第 2 人大两岁。
//问第 2 个人，说比第一个人大两岁。最后问第一个人，他说是 10 岁。请问第五个人多大？

public class program4 {
	public static void main(String[] args) {
		int age_1 = 10;
		int age_5 = age_1;
		for(int i=1;i<5;i++) {
			age_5 += 2;
		}
		System.out.println("第五个人的年龄是： "+age_5+"岁");
	}
}
