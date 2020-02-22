
//题目1：猴子吃桃问题：
//猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
//第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
//以后每天早上都吃了前一天剩下 的一半 零一个。到第 10 天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。

public class program1 {
	public static void main(String[] args) {
		int origin_peach;
		int last_peach = 1;
		for(int i=1;i<10;i++) {
			last_peach = (last_peach+1)*2;
		}
		origin_peach = last_peach;
		System.out.println("origin_peach_number = "+origin_peach);
	}
}

