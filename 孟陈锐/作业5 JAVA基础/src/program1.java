
//��Ŀ1�����ӳ������⣺
//���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ��
//�ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
//�Ժ�ÿ�����϶�����ǰһ��ʣ�� ��һ�� ��һ�������� 10 ���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�

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

