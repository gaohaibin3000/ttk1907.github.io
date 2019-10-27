package cn.itxdl.day14;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		// 1.����Stack���͵Ķ���
		Stack<Integer> st1 = new Stack<Integer>();
		// 2.������11��22��33��44��55������ջ����ӡ
		for(int i = 1; i <= 5; i++) {
			st1.push(i*11);
			System.out.println("ջ�е�Ԫ���У�" + st1); // 11 22 33 44 55
		}
		
		System.out.println("---------------------------");
		// 3.��ȡջ��Ԫ��ֵ����ӡ
		System.out.println("ջ��Ԫ���ǣ�" + st1.peek()); // 55
		
		System.out.println("---------------------------");
		// 4.��ջ������Ԫ�����γ�ջ����ӡ
		int len = st1.size();
		for(int i = 1; i <= len; i++) {
			System.out.println("��ջ��Ԫ���ǣ�" + st1.pop());// 55 44 .. 11
		}
		
		System.out.println("---------------------------");
		// 5.��ӡջ�����յ�����Ԫ��
		System.out.println("ջ�����յ�Ԫ���У�" + st1); // [ɶҲû��]
	}

}
