package cn.itxdl.day13;

import java.util.LinkedList;
import java.util.List;

public class ListTypeTest {

	public static void main(String[] args) {
		
		// 1.ʹ�÷��ͻ�������List���ϵ�����ָ��ʵ����Ķ���
		List<String> lt1 = new LinkedList<String>();
		// 2.����Ԫ�ز���ӡ
		lt1.add("one");
		lt1.add("two");
		System.out.println("lt1 = " + lt1); // [one, two]
		
		System.out.println("-------------------------------");
		// 3.ȡ��Ԫ�ز���ӡ
		String str1 = lt1.get(0);
		System.out.println("ȡ����Ԫ���ǣ�" + str1); // one
		
		System.out.println("-----------------------------------");
		// ��jdk1.7��ʼ���������ԣ�����<>�е��������Ϳ���ʡ��  ��������
		//List<Integer> lt2 = new LinkedList<Integer>();
		List<Integer> lt2 = new LinkedList<>();
		

	}

}
