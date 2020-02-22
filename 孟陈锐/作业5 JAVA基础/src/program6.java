
//题目：九头鸟有9 个头 2 只脚，凤凰有 1 个头 2 只脚，狮子有 1 个头 4 只脚，
//问如果需要凑齐 100个头与100只脚的动物 分别需要多少个九头鸟 、凤凰 、 狮子？

public class program6 {
	public static void main(String[] args) {
		int i, j, k, n=0, head=100, foot=100;
		for(i=0;i<12;i++) {
			for(j=0;j<51;j++) {
				for(k=0;k<26;k++) {
					if (9*i+j+k==head && 2*i+2*j+4*k==foot) {
						n++;
						System.out.println("这是第"+n+"组解");
						System.out.println("九头鸟有"+i+"只");
						System.out.println("凤凰有"+j+"只");
						System.out.println("狮子有"+k+"头\n");
					}
				}
			}
		}
		
	}
}
