package cn.itxdl.day13;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		// 1.��ʾ�û�����ѧ��������ʹ�ñ�����¼
		System.out.println("������ѧ��������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.����ѧ������׼��һ��һά����
		Student[] arr = new Student[num];
		
		// 3.��ʾ�û�����ÿ��ѧ������Ϣ����¼��һά������
		for(int i = 0; i < num; i++) {
			System.out.println("�������" + (i+1) + "��ѧ������Ϣ(ѧ��,����,����)��");
			String str1 = sc.next();
			System.out.println(str1);
			// ���û������ѧ����Ϣ���в�֣���ӡ����
			String[] sArr = str1.split(",");
			System.out.println("sArr[0] = " + sArr[0]);
			System.out.println("sArr[1] = " + sArr[1]);
			System.out.println("sArr[2] = " + sArr[2]);
			// ����ȡ����ÿ��ѧ����Ϣ���뵽һά����
			arr[i] = new Student(Integer.parseInt(sArr[0]), 
					sArr[1], Integer.parseInt(sArr[2]));
		}
		
		System.out.println("-------------------------------");
		// 4.��ӡ������zhang��ѧ��
		for(int i = 0; i < num; i++) {
			if(arr[i].getName().startsWith("zhang")) {
				System.out.println(arr[i]);
			}
		}
	}

}
