package cn.itxdl.day14;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		// 1.声明Queue类型的引用指向实现类的对象
		Queue<Integer> q1 = new LinkedList<Integer>();
		// 2.将数据11、22、33、44、55依次放入队列中
		for(int i = 1; i <= 5; i++) {
			boolean b1 = q1.offer(i*11);
			//System.out.println("b1 = " + b1);
			System.out.println("队列中的元素有：" + q1); //11 22 33 44 55
		}
		
		System.out.println("------------------------------------");
		// 3.获取队首元素并打印
		System.out.println("队列中队首元素是：" + q1.peek()); //11
		
		System.out.println("------------------------------------");		
		// 4.将队列中的所有元素依次删除并打印
		int len = q1.size();
		for(int i = 1; i <= len; i++) {
			System.out.println("出队的元素是：" + q1.poll());//11 22 33 44 55
		}
		
		System.out.println("------------------------------------");	
		// 5.打印队列中最终的所有元素
		System.out.println("队列中最终的元素有：" + q1); //[啥也没有]
	}

}
