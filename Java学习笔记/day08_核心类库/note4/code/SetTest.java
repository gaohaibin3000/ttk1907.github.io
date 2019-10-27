package cn.itxdl.day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		// 1.声明Set集合的引用指向实现类的对象
		Set<String> s1 = new HashSet<String>();
		// 2.向集合中添加元素并打印出来
		boolean b1 = s1.add("two");
		System.out.println("b1 = " + b1); //true
		System.out.println("集合中的元素有：" + s1); //[two]
		
		b1 = s1.add("one");
		System.out.println("b1 = " + b1); //true
		// 没有先后放入次序
		System.out.println("集合中的元素有：" + s1); //[one, two] 
		
		b1 = s1.add("three");
		System.out.println("b1 = " + b1); //true
		System.out.println("集合中的元素有：" + s1); //[one, two, three]
		
		b1 = s1.add("two");
		System.out.println("b1 = " + b1); //false
		// 该集合中的元素不允许重复
		// 自动调用toString方法，打印String类型的整体
		System.out.println("集合中的元素有：" + s1); //[one, two, three]
		
		System.out.println("-----------------------------------------");
		// 3.使用迭代器来访问集合中的所有元素
		// 3.1 调用成员方法获取迭代器对象
		Iterator<String> it = s1.iterator();
		// 3.2 使用迭代器对象获取每个元素并打印
		/*
		// 判断该迭代器指向的集合中是否拥有可以迭代/遍历的元素
		System.out.println(it.hasNext()); // true
		// 获取一个元素并指向下一个位置
		// 与toString方法相比取出的是单个元素，更加灵活
		System.out.println("获取到的元素是：" + it.next()); //one 
		
		System.out.println(it.hasNext()); // true
		System.out.println("获取到的元素是：" + it.next()); //two 
		
		System.out.println(it.hasNext()); // true
		System.out.println("获取到的元素是：" + it.next()); //three 
		
		System.out.println(it.hasNext()); // false
		//System.out.println("获取到的元素是：" + it.next()); // 
		*/
		while(it.hasNext()) {
			System.out.println("获取到的元素是：" + it.next());
		}
		
		System.out.println("------------------------------------");
		//练习：使用StringBuilder类和迭代器实现toString方法的效果
		// 4.1.构造StringBuilder类型的对象用于拼接
		StringBuilder sb1 = new StringBuilder();
		// 4.2.使用迭代器取出集合中的每个元素并拼接到StringBuilder对象中
		sb1.append("集合中的元素有：[");
		// 重新获取迭代器，或者叫重置迭代器   [one, two, three]
		it = s1.iterator();
		while(it.hasNext()) {
			//System.out.println("你到底爱不爱我？？？");
			//sb1.append(it.next()).append(",").append(" ");
			String ts = it.next();
			// 当条件成立时证明该元素不是最后一个元素
			if(it.hasNext()) {
				sb1.append(ts).append(",").append(" ");
			} else {
				sb1.append(ts).append("]");
			}
		}
		// 最后多余的逗号和空格删除
		//sb1.delete(sb1.length()-2, sb1.length()).append("]");
		// 4.3.打印最终的拼接结果
		System.out.println(sb1); //[one, two, three]
		
		System.out.println("------------------------------------");
		// 5.使用迭代器来获取集合中的所有元素，当元素值为"two"时则删除该元素
		// 5.1 重新获取迭代器对象
		it = s1.iterator();
		// 5.2 取出集合中的每个元素并进行判断，若是"two"则删除
		while(it.hasNext()) {
			String ts = it.next();
			if("two".equals(ts)) {
				it.remove(); // 调用迭代器的remove方法删除  ok
				//s1.remove(ts); // 调用集合的remove方法删除  error
			}
		}
		// 5.3 打印删除之后的结果
		System.out.println("删除后集合的元素有：" + s1);// [one, three]
		
		System.out.println("------------------------------------");
		// 6.使用for each结构来遍历Set集合中的所有元素
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
