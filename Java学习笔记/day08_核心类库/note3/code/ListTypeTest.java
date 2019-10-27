package cn.itxdl.day13;

import java.util.LinkedList;
import java.util.List;

public class ListTypeTest {

	public static void main(String[] args) {
		
		// 1.使用泛型机制声明List集合的引用指向实现类的对象
		List<String> lt1 = new LinkedList<String>();
		// 2.放入元素并打印
		lt1.add("one");
		lt1.add("two");
		System.out.println("lt1 = " + lt1); // [one, two]
		
		System.out.println("-------------------------------");
		// 3.取出元素并打印
		String str1 = lt1.get(0);
		System.out.println("取出的元素是：" + str1); // one
		
		System.out.println("-----------------------------------");
		// 从jdk1.7开始增加新特性：后面<>中的数据类型可以省略  菱形特性
		//List<Integer> lt2 = new LinkedList<Integer>();
		List<Integer> lt2 = new LinkedList<>();
		

	}

}
