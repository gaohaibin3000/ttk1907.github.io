package cn.itxdl.day13;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

	public static void main(String[] args) {
		
		// 1.声明Collection类型的引用指向实现类ArrayList的对象
		// 接口类型的引用指向实现类的对象，形成了多态
		Collection c1 = new ArrayList();
		// 2.调用方法实现元素的添加
		boolean b1 = c1.add(new String("one"));
		System.out.println("b1 = " + b1); // b1 = true
		// 自动调用toString方法，最终调用实现类中的toString方法
		// 该方法的默认打印格式为：[元素1, 元素2, ...]
		System.out.println("c1 = " + c1); // c1 = [one]
		
		b1 = c1.add(new Integer(2));
		System.out.println("b1 = " + b1); // b1 = true
		System.out.println("c1 = " + c1); // c1 = [one, 2]
		
		b1 = c1.add(new Student(1001, "zhangfei", 30));
		System.out.println("b1 = " + b1); // b1 = true
		// [one, 2, Student [id=1001, name=zhangfei, age=30]]
		// 打印集合的本质就是打印每个元素值，本质上就是调用元素对应的toString方法
		System.out.println("c1 = " + c1); 
		
		System.out.println("--------------------------------------");
		// 3.调用方法实现查找的功能
		b1 = c1.contains(new Integer(1));
		System.out.println("b1 = " + b1); // false
		
		b1 = c1.contains(new Integer(2));
		System.out.println("b1 = " + b1); // true
		
		// contains方法的执行原理：(o==null ? e==null : o.equals(e)) 
		// 若传入的实参对象为null，则判断集合中所有元素是否有null值
		// 若传入的实参对象不为null，则使用参数对象调用equals方法与集合中
		// 元素依次比较是否相等
		// 当Student类中没有重写equals方法时，调用从Object继承的版本 比较地址
		// 若希望比较两个对象的内容，则应该重写equals方法
		// 当Student类中重写equals方法后，调用重写的版本 比较内容
		b1 = c1.contains(new Student(1001, "zhangfei", 30));
		System.out.println("b1 = " + b1); // false true
		
		System.out.println("--------------------------------------");
		// 4.调用方法实现删除的操作
		// [one, 2, Student [id=1001, name=zhangfei, age=30]]
		b1 = c1.remove(new String("two"));
		System.out.println("b1 = " + b1); //b1 = false
		// [one, 2, Student [id=1001, name=zhangfei, age=30]]
		System.out.println("c1 = " + c1); 
		
		b1 = c1.remove(new String("one"));
		System.out.println("b1 = " + b1); //b1 = true
		// [2, Student [id=1001, name=zhangfei, age=30]]
		System.out.println("c1 = " + c1); 
		
		// 调用方法实现清空集合
		c1.clear();
		System.out.println("c1 = " + c1); // c1=[啥也没有]
		
		System.out.println("--------------------------------------");
		// 5.获取集合中元素的个数以及判断是否为空
		System.out.println("集合中元素的个数是：" + c1.size()); // 0
		System.out.println((0 == c1.size()? "集合已经空了": "集合没有空"));
		System.out.println(c1.isEmpty()? "集合已经空了": "集合还没有空");
	}

}
