
//��Ŀ����ͷ����9 ��ͷ 2 ֻ�ţ������ 1 ��ͷ 2 ֻ�ţ�ʨ���� 1 ��ͷ 4 ֻ�ţ�
//�������Ҫ���� 100��ͷ��100ֻ�ŵĶ��� �ֱ���Ҫ���ٸ���ͷ�� ����� �� ʨ�ӣ�

public class program6 {
	public static void main(String[] args) {
		int i, j, k, n=0, head=100, foot=100;
		for(i=0;i<12;i++) {
			for(j=0;j<51;j++) {
				for(k=0;k<26;k++) {
					if (9*i+j+k==head && 2*i+2*j+4*k==foot) {
						n++;
						System.out.println("���ǵ�"+n+"���");
						System.out.println("��ͷ����"+i+"ֻ");
						System.out.println("�����"+j+"ֻ");
						System.out.println("ʨ����"+k+"ͷ\n");
					}
				}
			}
		}
		
	}
}
