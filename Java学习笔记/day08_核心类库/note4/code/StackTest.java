package cn.itxdl.day14;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		// 1.构造Stack类型的对象
		Stack<Integer> st1 = new Stack<Integer>();
		// 2.将数据11、22、33、44、55依次入栈并打印
		for(int i = 1; i <= 5; i++) {
			st1.push(i*11);
			System.out.println("栈中的元素有：" + st1); // 11 22 33 44 55
		}
		
		System.out.println("---------------------------");
		// 3.获取栈顶元素值并打印
		System.out.println("栈顶元素是：" + st1.peek()); // 55
		
		System.out.println("---------------------------");
		// 4.将栈中所有元素依次出栈并打印
		int len = st1.size();
		for(int i = 1; i <= len; i++) {
			System.out.println("出栈的元素是：" + st1.pop());// 55 44 .. 11
		}
		
		System.out.println("---------------------------");
		// 5.打印栈中最终的所有元素
		System.out.println("栈中最终的元素有：" + st1); // [啥也没有]
	}

}
