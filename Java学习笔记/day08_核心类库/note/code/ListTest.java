package cn.itxdl.day13;

import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		// 1.����List���ϵ�����ָ��ʵ����Ķ���
		// �ӿ����͵�����ָ��ʵ����Ķ����γ��˶�̬
		List lt1 = new LinkedList();
		// 2.���÷����򼯺������Ԫ��  ������ 
		// ʵ�����±�Ϊ0��λ�����Ԫ�� one����ͷλ�ò���Ԫ��
		lt1.add(0, "one");
		System.out.println("lt1 = " + lt1); // lt1 = [one]
		// ��ĩβλ�ò���Ԫ��
		lt1.add(1, 2); // �Զ�װ�似�� 
		System.out.println("lt1 = " + lt1); // lt1 = [one, 2]
		// û��ָ���±꣬Ĭ�ϲ��뵽ĩβ
		lt1.add(new Student(1001, "zhangfei", 30));
		// [one, 2, Student[id = 1001, name = zhangfei, age = 30]]
		System.out.println("lt1 = " + lt1);
		// ���м�λ�ò���Ԫ��three
		lt1.add(2, "three");
		// [one, 2, three, Student[id = 1001, name = zhangfei, age = 30]]
		// �Ե��õ���toString���������մ�ӡString���͵�����
		System.out.println("lt1 = " + lt1); 
		
		System.out.println("------------------------------------");
		// 3.���÷���ʵ�ּ�����Ԫ�صĻ�ȡ����ӡ �ص�
		StringBuilder sb1 = new StringBuilder();
		sb1.append("lt1 = [");
		for(int i = 0; i < lt1.size(); i++) {
			// ʹ��get��������ȡ������Ԫ�أ��൱��toString�����������
			//System.out.println("�±�Ϊ" + i + "��Ԫ���ǣ�" + lt1.get(i));
			if(lt1.size()-1 == i) {
				sb1.append(lt1.get(i)).append("]");
			} else {
				sb1.append(lt1.get(i)).append(",").append(" ");
			}
		}
		System.out.println(sb1);
		
		System.out.println("------------------------------------");
		// [one, 2, three, Student[id = 1001, name = zhangfei, age = 30]]
		System.out.println("lt1 = " + lt1);
		// 4.���÷���ʵ�ּ�����Ԫ�ص��޸Ĳ���
		Integer it1 = (Integer) lt1.set(1, "two");
		System.out.println("���޸ĵ�Ԫ���ǣ�" + it1); // 2
		// [one, two, three, Student[id = 1001, name = zhangfei, age = 30]]
		System.out.println("�޸ĺ󼯺��е�Ԫ���У�" + lt1);
		
		// ���ڼ����д�ŵ��������ݶ��ǰ���Object���ͷ���ģ����ȡ����
		// Ҳ����Object���ͣ�Ϊ�˱����ʵ��������Ҫǿ������ת��
		Student s1 = (Student) lt1.set(lt1.size()-1, "four");
		// Student[id = 1001, name = zhangfei, age = 30]
		System.out.println("���޸ĵ�Ԫ���ǣ�" + s1);
		// [one, two, three, four]
		System.out.println("�޸ĺ󼯺��е�Ԫ���У�" + lt1);
		
		System.out.println("------------------------------------");
		// 5.���÷���ʵ�ּ�����Ԫ�ص�ɾ������
		String str1 = (String) lt1.remove(0);
		System.out.println("��ɾ����Ԫ���ǣ�" + str1); // one
		// [two, three, four]
		System.out.println("ɾ���󼯺��е�Ԫ���У�" + lt1);
		
		// ʹ��remove�����������е�����Ԫ��ɾ��
		//for (int i = 0; i < lt1.size();/* i++ */) {
		//while(lt1.size() > 0) {
		/*
		for(int i = lt1.size()-1; i >= 0; i--) {
			System.out.println("��ɾ����Ԫ���ǣ�" + lt1.remove(i));
			//System.out.println("��ɾ����Ԫ���ǣ�" + lt1.remove(0));
		}
		System.out.println("���ռ����е�Ԫ���У�" + lt1); //ɶҲû��
		*/
		
		System.out.println("------------------------------------");
		// [two, three, four]
		System.out.println("ɾ���󼯺��е�Ԫ���У�" + lt1);
		// 6.��ȡ�����е�һ��������
		List lt2 = lt1.subList(1, lt1.size());
		System.out.println("��ȡ�����Ӽ����ǣ�" + lt2);  // [three, four]
		// ɾ���Ӽ����еĵ�һ��Ԫ��
		String str2 = (String) lt2.remove(0);
		System.out.println("��ɾ����Ԫ���ǣ�" + str2); // three
		System.out.println("lt2 = " + lt2); // [four]
		System.out.println("lt1 = " + lt1); // [two, four] ����һ���ڴ�
	}

}
