package cn.itxdl.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		// 1.����Map���͵�����ָ��ʵ����Ķ���
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		// 2.�򼯺������Ԫ�ز���ӡ
		String str1 = m1.put(1, "one");
		System.out.println("str1 = " + str1); // null
		// �Զ�����toString������Ĭ�ϸ�ʽΪ��{key1=value1, key2=value2, ...}
		System.out.println("�����е�Ԫ���У�" + m1); // {1=one}
		
		str1 = m1.put(2, "two");
		System.out.println("str1 = " + str1); // null
		System.out.println("�����е�Ԫ���У�" + m1); // {1=one, 2=two}
		
		str1 = m1.put(3, "three");
		System.out.println("str1 = " + str1); // null
		// {1=one, 2=two, 3=three}
		System.out.println("�����е�Ԫ���У�" + m1); 

		// ʵ�����޸ĵĹ���
		str1 = m1.put(1, "eleven");
		System.out.println("str1 = " + str1); // one
		// {1=eleven, 2=two, 3=three}
		System.out.println("�����е�Ԫ���У�" + m1); 
		
		System.out.println("-------------------------------------");
		// 3.ʵ�ֲ��ҵĹ���
		String str2 = m1.get(11);
		System.out.println("��ȡ����ֵ�ǣ�" + str2); // null
		str2 = m1.get(1);
		System.out.println("��ȡ����ֵ�ǣ�" + str2); // eleven
		
		//�ж�key��value�Ƿ����
		System.out.println(m1.containsKey(1)); // true
		System.out.println(m1.containsKey(11));// false
		System.out.println(m1.containsValue("one")); // false
		System.out.println(m1.containsValue("eleven")); //true
		
		System.out.println("-------------------------------------");
		// 4.ʵ��ɾ���Ĺ���
		String str3 = m1.remove(5);
		System.out.println("str3 = " + str3); // null
		
		str3 = m1.remove(3);
		System.out.println("str3 = " + str3); // three
		// ������ʽһ������toString������String���͵�����
		System.out.println("�����е�Ԫ���У�" + m1);// {1=eleven, 2=two}
		
		System.out.println("-------------------------------------");
		// 5.ʵ�ּ���������Ԫ�صı���
		// ������ʽ��������entrySet�������Լ�ֵ��Ϊ������λ����ת��  ���
		Set<Map.Entry<Integer,String>> s1 = m1.entrySet();
		// ʹ��for each�ṹ����Set�����е�����Ԫ��
		for(Map.Entry<Integer,String> me : s1) {
			System.out.println(me);
			//System.out.println(me.getKey() + "��Ӧ" + me.getValue());
		}
		
		System.out.println("-------------------------------------");
		// ������ʽ��������keySet�������Լ���Ϊ������λ����ת��  ���
		Set<Integer> s2 = m1.keySet();
		// ʹ��for each�ṹ����Set�����е�����Ԫ��
		for(Integer in : s2) {
			System.out.println(in + "=" + m1.get(in));
		}
	}

}
