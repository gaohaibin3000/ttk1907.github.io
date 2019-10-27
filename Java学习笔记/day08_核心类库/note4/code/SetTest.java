package cn.itxdl.day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		// 1.����Set���ϵ�����ָ��ʵ����Ķ���
		Set<String> s1 = new HashSet<String>();
		// 2.�򼯺������Ԫ�ز���ӡ����
		boolean b1 = s1.add("two");
		System.out.println("b1 = " + b1); //true
		System.out.println("�����е�Ԫ���У�" + s1); //[two]
		
		b1 = s1.add("one");
		System.out.println("b1 = " + b1); //true
		// û���Ⱥ�������
		System.out.println("�����е�Ԫ���У�" + s1); //[one, two] 
		
		b1 = s1.add("three");
		System.out.println("b1 = " + b1); //true
		System.out.println("�����е�Ԫ���У�" + s1); //[one, two, three]
		
		b1 = s1.add("two");
		System.out.println("b1 = " + b1); //false
		// �ü����е�Ԫ�ز������ظ�
		// �Զ�����toString��������ӡString���͵�����
		System.out.println("�����е�Ԫ���У�" + s1); //[one, two, three]
		
		System.out.println("-----------------------------------------");
		// 3.ʹ�õ����������ʼ����е�����Ԫ��
		// 3.1 ���ó�Ա������ȡ����������
		Iterator<String> it = s1.iterator();
		// 3.2 ʹ�õ����������ȡÿ��Ԫ�ز���ӡ
		/*
		// �жϸõ�����ָ��ļ������Ƿ�ӵ�п��Ե���/������Ԫ��
		System.out.println(it.hasNext()); // true
		// ��ȡһ��Ԫ�ز�ָ����һ��λ��
		// ��toString�������ȡ�����ǵ���Ԫ�أ��������
		System.out.println("��ȡ����Ԫ���ǣ�" + it.next()); //one 
		
		System.out.println(it.hasNext()); // true
		System.out.println("��ȡ����Ԫ���ǣ�" + it.next()); //two 
		
		System.out.println(it.hasNext()); // true
		System.out.println("��ȡ����Ԫ���ǣ�" + it.next()); //three 
		
		System.out.println(it.hasNext()); // false
		//System.out.println("��ȡ����Ԫ���ǣ�" + it.next()); // 
		*/
		while(it.hasNext()) {
			System.out.println("��ȡ����Ԫ���ǣ�" + it.next());
		}
		
		System.out.println("------------------------------------");
		//��ϰ��ʹ��StringBuilder��͵�����ʵ��toString������Ч��
		// 4.1.����StringBuilder���͵Ķ�������ƴ��
		StringBuilder sb1 = new StringBuilder();
		// 4.2.ʹ�õ�����ȡ�������е�ÿ��Ԫ�ز�ƴ�ӵ�StringBuilder������
		sb1.append("�����е�Ԫ���У�[");
		// ���»�ȡ�����������߽����õ�����   [one, two, three]
		it = s1.iterator();
		while(it.hasNext()) {
			//System.out.println("�㵽�װ������ң�����");
			//sb1.append(it.next()).append(",").append(" ");
			String ts = it.next();
			// ����������ʱ֤����Ԫ�ز������һ��Ԫ��
			if(it.hasNext()) {
				sb1.append(ts).append(",").append(" ");
			} else {
				sb1.append(ts).append("]");
			}
		}
		// ������Ķ��źͿո�ɾ��
		//sb1.delete(sb1.length()-2, sb1.length()).append("]");
		// 4.3.��ӡ���յ�ƴ�ӽ��
		System.out.println(sb1); //[one, two, three]
		
		System.out.println("------------------------------------");
		// 5.ʹ�õ���������ȡ�����е�����Ԫ�أ���Ԫ��ֵΪ"two"ʱ��ɾ����Ԫ��
		// 5.1 ���»�ȡ����������
		it = s1.iterator();
		// 5.2 ȡ�������е�ÿ��Ԫ�ز������жϣ�����"two"��ɾ��
		while(it.hasNext()) {
			String ts = it.next();
			if("two".equals(ts)) {
				it.remove(); // ���õ�������remove����ɾ��  ok
				//s1.remove(ts); // ���ü��ϵ�remove����ɾ��  error
			}
		}
		// 5.3 ��ӡɾ��֮��Ľ��
		System.out.println("ɾ���󼯺ϵ�Ԫ���У�" + s1);// [one, three]
		
		System.out.println("------------------------------------");
		// 6.ʹ��for each�ṹ������Set�����е�����Ԫ��
		for(String ts : s1) {
			System.out.println(ts);
		}
		
		System.out.println("-----------------------------");
		int[] arr = {11, 22, 33, 44, 55};
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
