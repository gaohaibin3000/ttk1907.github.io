package cn.itxdl.day13;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// 1.����StringBuilder���͵Ķ����������ַ�������
		StringBuilder sb1 = new StringBuilder("ABCD");
		// 2.���ַ������ݽ��д�����¼
		// ��ʽһ��ֱ�ӽ����Ų��뵽�ַ�����ָ��λ��
		/*
		sb1.insert(1, ",");    //A,BCD 
		sb1.insert(3, ",");    //A,B,CD
		sb1.insert(5, ",");    //A,B,C,D
		
		for(int i = 1; i <= 5; i += 2) {
			sb1.insert(i, ",");
		}
		*/
		// ��ʽ����ȡ���ַ����е�ÿ���ַ�Ȼ��ƴ�Ӷ��ű��浽����һ��������
		StringBuilder sb2 = new StringBuilder();
		for(int i = 0; i < sb1.length(); i++) {
			//sb2.append(sb1.charAt(i)).append(",");
			if(sb1.length()-1 == i) {
				sb2.append(sb1.charAt(i));
			} else {
				sb2.append(sb1.charAt(i)).append(",");
			}
		}
		// ɾ��������Ķ���
		//sb2.deleteCharAt(sb2.length()-1);
		
		// 3.��ӡ���յĴ����� ctrl+alt+���·���� ��������
		//System.out.println("sb1 = " + sb1); // A,B,C,D
		System.out.println("sb2 = " + sb2); // A,B,C,D

	}

}
