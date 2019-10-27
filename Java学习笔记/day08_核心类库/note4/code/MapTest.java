package cn.itxdl.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		// 1.声明Map类型的引用指向实现类的对象
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		// 2.向集合中添加元素并打印
		String str1 = m1.put(1, "one");
		System.out.println("str1 = " + str1); // null
		// 自动调用toString方法，默认格式为：{key1=value1, key2=value2, ...}
		System.out.println("集合中的元素有：" + m1); // {1=one}
		
		str1 = m1.put(2, "two");
		System.out.println("str1 = " + str1); // null
		System.out.println("集合中的元素有：" + m1); // {1=one, 2=two}
		
		str1 = m1.put(3, "three");
		System.out.println("str1 = " + str1); // null
		// {1=one, 2=two, 3=three}
		System.out.println("集合中的元素有：" + m1); 

		// 实现了修改的功能
		str1 = m1.put(1, "eleven");
		System.out.println("str1 = " + str1); // one
		// {1=eleven, 2=two, 3=three}
		System.out.println("集合中的元素有：" + m1); 
		
		System.out.println("-------------------------------------");
		// 3.实现查找的功能
		String str2 = m1.get(11);
		System.out.println("获取到的值是：" + str2); // null
		str2 = m1.get(1);
		System.out.println("获取到的值是：" + str2); // eleven
		
		//判断key和value是否存在
		System.out.println(m1.containsKey(1)); // true
		System.out.println(m1.containsKey(11));// false
		System.out.println(m1.containsValue("one")); // false
		System.out.println(m1.containsValue("eleven")); //true
		
		System.out.println("-------------------------------------");
		// 4.实现删除的功能
		String str3 = m1.remove(5);
		System.out.println("str3 = " + str3); // null
		
		str3 = m1.remove(3);
		System.out.println("str3 = " + str3); // three
		// 遍历方式一：调用toString方法，String类型的整体
		System.out.println("集合中的元素有：" + m1);// {1=eleven, 2=two}
		
		System.out.println("-------------------------------------");
		// 5.实现集合中所有元素的遍历
		// 遍历方式二：调用entrySet方法，以键值对为基本单位进行转换  灵活
		Set<Map.Entry<Integer,String>> s1 = m1.entrySet();
		// 使用for each结构遍历Set集合中的所有元素
		for(Map.Entry<Integer,String> me : s1) {
			System.out.println(me);
			//System.out.println(me.getKey() + "对应" + me.getValue());
		}
		
		System.out.println("-------------------------------------");
		// 遍历方式三：调用keySet方法，以键作为基本单位进行转换  灵活
		Set<Integer> s2 = m1.keySet();
		// 使用for each结构遍历Set集合中的所有元素
		for(Integer in : s2) {
			System.out.println(in + "=" + m1.get(in));
		}
	}

}
