package cn.itxdl.day14;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		// 1.����Queue���͵�����ָ��ʵ����Ķ���
		Queue<Integer> q1 = new LinkedList<Integer>();
		// 2.������11��22��33��44��55���η��������
		for(int i = 1; i <= 5; i++) {
			boolean b1 = q1.offer(i*11);
			//System.out.println("b1 = " + b1);
			System.out.println("�����е�Ԫ���У�" + q1); //11 22 33 44 55
		}
		
		System.out.println("------------------------------------");
		// 3.��ȡ����Ԫ�ز���ӡ
		System.out.println("�����ж���Ԫ���ǣ�" + q1.peek()); //11
		
		System.out.println("------------------------------------");		
		// 4.�������е�����Ԫ������ɾ������ӡ
		int len = q1.size();
		for(int i = 1; i <= len; i++) {
			System.out.println("���ӵ�Ԫ���ǣ�" + q1.poll());//11 22 33 44 55
		}
		
		System.out.println("------------------------------------");	
		// 5.��ӡ���������յ�����Ԫ��
		System.out.println("���������յ�Ԫ���У�" + q1); //[ɶҲû��]
	}

}
