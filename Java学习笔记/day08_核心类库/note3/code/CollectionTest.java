package cn.itxdl.day13;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

	public static void main(String[] args) {
		
		// 1.����Collection���͵�����ָ��ʵ����ArrayList�Ķ���
		// �ӿ����͵�����ָ��ʵ����Ķ����γ��˶�̬
		Collection c1 = new ArrayList();
		// 2.���÷���ʵ��Ԫ�ص����
		boolean b1 = c1.add(new String("one"));
		System.out.println("b1 = " + b1); // b1 = true
		// �Զ�����toString���������յ���ʵ�����е�toString����
		// �÷�����Ĭ�ϴ�ӡ��ʽΪ��[Ԫ��1, Ԫ��2, ...]
		System.out.println("c1 = " + c1); // c1 = [one]
		
		b1 = c1.add(new Integer(2));
		System.out.println("b1 = " + b1); // b1 = true
		System.out.println("c1 = " + c1); // c1 = [one, 2]
		
		b1 = c1.add(new Student(1001, "zhangfei", 30));
		System.out.println("b1 = " + b1); // b1 = true
		// [one, 2, Student [id=1001, name=zhangfei, age=30]]
		// ��ӡ���ϵı��ʾ��Ǵ�ӡÿ��Ԫ��ֵ�������Ͼ��ǵ���Ԫ�ض�Ӧ��toString����
		System.out.println("c1 = " + c1); 
		
		System.out.println("--------------------------------------");
		// 3.���÷���ʵ�ֲ��ҵĹ���
		b1 = c1.contains(new Integer(1));
		System.out.println("b1 = " + b1); // false
		
		b1 = c1.contains(new Integer(2));
		System.out.println("b1 = " + b1); // true
		
		// contains������ִ��ԭ��(o==null ? e==null : o.equals(e)) 
		// �������ʵ�ζ���Ϊnull�����жϼ���������Ԫ���Ƿ���nullֵ
		// �������ʵ�ζ���Ϊnull����ʹ�ò����������equals�����뼯����
		// Ԫ�����αȽ��Ƿ����
		// ��Student����û����дequals����ʱ�����ô�Object�̳еİ汾 �Ƚϵ�ַ
		// ��ϣ���Ƚ�������������ݣ���Ӧ����дequals����
		// ��Student������дequals�����󣬵�����д�İ汾 �Ƚ�����
		b1 = c1.contains(new Student(1001, "zhangfei", 30));
		System.out.println("b1 = " + b1); // false true
		
		System.out.println("--------------------------------------");
		// 4.���÷���ʵ��ɾ���Ĳ���
		// [one, 2, Student [id=1001, name=zhangfei, age=30]]
		b1 = c1.remove(new String("two"));
		System.out.println("b1 = " + b1); //b1 = false
		// [one, 2, Student [id=1001, name=zhangfei, age=30]]
		System.out.println("c1 = " + c1); 
		
		b1 = c1.remove(new String("one"));
		System.out.println("b1 = " + b1); //b1 = true
		// [2, Student [id=1001, name=zhangfei, age=30]]
		System.out.println("c1 = " + c1); 
		
		// ���÷���ʵ����ռ���
		c1.clear();
		System.out.println("c1 = " + c1); // c1=[ɶҲû��]
		
		System.out.println("--------------------------------------");
		// 5.��ȡ������Ԫ�صĸ����Լ��ж��Ƿ�Ϊ��
		System.out.println("������Ԫ�صĸ����ǣ�" + c1.size()); // 0
		System.out.println((0 == c1.size()? "�����Ѿ�����": "����û�п�"));
		System.out.println(c1.isEmpty()? "�����Ѿ�����": "���ϻ�û�п�");
	}

}
