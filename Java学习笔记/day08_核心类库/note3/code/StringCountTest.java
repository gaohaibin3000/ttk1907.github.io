package cn.itxdl.day13;

public class StringCountTest {

	public static void main(String[] args) {
		
		// 1.����String���͵Ķ��������ַ���"ABCD123!@#$%ab"
		String str1 = new String("ABCD123!@#$%ab");
		// 2.׼��һ������Ϊ4Ԫ������Ϊint���͵�һά����
		int[] arr = new int[4];
		
		// 3.ѭ��ȡ���ַ����е�ÿ���ַ������жϲ���¼��������
		for(int i = 0; i < str1.length(); i++) {
			char tc = str1.charAt(i);
			// �����ַ��Ǵ�д��ĸʱ�����ڴ�д��ĸ�ĸ����ϼ�1
			if(tc >= 'A' && tc <= 'Z') {
				arr[0]++;
			}
			// �����ַ���Сд��ĸʱ������Сд��ĸ�ĸ����ϼ�1
			else if(tc >= 'a' && tc <= 'z') {
				arr[1]++;
			}
			// �����ַ��������ַ�ʱ�����������ַ��ĸ����ϼ�1
			else if(tc >= '0' && tc <= '9') {
				arr[2]++;
			}
			// �����ַ�
			else {
				arr[3]++;
			}
		}
		
		// 4.��ӡ���յ�ͳ�ƽ��
		System.out.println("��д��ĸ������" + arr[0] 
				+ "�Σ�Сд��ĸ������" + arr[1] + "�Σ������ַ�������" 
				+ arr[2] + "�Σ������ַ�������" + arr[3] + "�Σ�");// 4 2 3 5
	}

}
