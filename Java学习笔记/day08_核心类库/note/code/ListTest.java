package cn.itxdl.day13;

import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		// 1.声明List集合的引用指向实现类的对象
		// 接口类型的引用指向实现类的对象，形成了多态
		List lt1 = new LinkedList();
		// 2.调用方法向集合中添加元素  常量池 
		// 实现向下标为0的位置添加元素 one，向开头位置插入元素
		lt1.add(0, "one");
		System.out.println("lt1 = " + lt1); // lt1 = [one]
		// 向末尾位置插入元素
		lt1.add(1, 2); // 自动装箱技术 
		System.out.println("lt1 = " + lt1); // lt1 = [one, 2]
		// 没有指定下标，默认插入到末尾
		lt1.add(new Student(1001, "zhangfei", 30));
		// [one, 2, Student[id = 1001, name = zhangfei, age = 30]]
		System.out.println("lt1 = " + lt1);
		// 向中间位置插入元素three
		lt1.add(2, "three");
		// [one, 2, three, Student[id = 1001, name = zhangfei, age = 30]]
		// 自调用调用toString方法，最终打印String类型的整体
		System.out.println("lt1 = " + lt1); 
		
		System.out.println("------------------------------------");
		// 3.调用方法实现集合中元素的获取并打印 重点
		StringBuilder sb1 = new StringBuilder();
		sb1.append("lt1 = [");
		for(int i = 0; i < lt1.size(); i++) {
			// 使用get方法可以取出任意元素，相当于toString方法更加灵活
			//System.out.println("下标为" + i + "的元素是：" + lt1.get(i));
			if(lt1.size()-1 == i) {
				sb1.append(lt1.get(i)).append("]");
			} else {
				sb1.append(lt1.get(i)).append(",").append(" ");
			}
		}
		System.out.println(sb1);
		
		System.out.println("------------------------------------");
		// [one, 2, three, Student[id = 1001, name = zhangfei, age = 30]]
		System.out.println("lt1 = " + lt1);
		// 4.调用方法实现集合中元素的修改操作
		Integer it1 = (Integer) lt1.set(1, "two");
		System.out.println("被修改的元素是：" + it1); // 2
		// [one, two, three, Student[id = 1001, name = zhangfei, age = 30]]
		System.out.println("修改后集合中的元素有：" + lt1);
		
		// 由于集合中存放的所有内容都是按照Object类型放入的，因此取出来
		// 也就是Object类型，为了表达真实的类型需要强制类型转换
		Student s1 = (Student) lt1.set(lt1.size()-1, "four");
		// Student[id = 1001, name = zhangfei, age = 30]
		System.out.println("被修改的元素是：" + s1);
		// [one, two, three, four]
		System.out.println("修改后集合中的元素有：" + lt1);
		
		System.out.println("------------------------------------");
		// 5.调用方法实现集合中元素的删除操作
		String str1 = (String) lt1.remove(0);
		System.out.println("被删除的元素是：" + str1); // one
		// [two, three, four]
		System.out.println("删除后集合中的元素有：" + lt1);
		
		// 使用remove方法将集合中的所有元素删除
		//for (int i = 0; i < lt1.size();/* i++ */) {
		//while(lt1.size() > 0) {
		/*
		for(int i = lt1.size()-1; i >= 0; i--) {
			System.out.println("被删除的元素是：" + lt1.remove(i));
			//System.out.println("被删除的元素是：" + lt1.remove(0));
		}
		System.out.println("最终集合中的元素有：" + lt1); //啥也没有
		*/
		
		System.out.println("------------------------------------");
		// [two, three, four]
		System.out.println("删除后集合中的元素有：" + lt1);
		// 6.获取集合中的一部分内容
		List lt2 = lt1.subList(1, lt1.size());
		System.out.println("获取到的子集合是：" + lt2);  // [three, four]
		// 删除子集合中的第一个元素
		String str2 = (String) lt2.remove(0);
		System.out.println("被删除的元素是：" + str2); // three
		System.out.println("lt2 = " + lt2); // [four]
		System.out.println("lt1 = " + lt1); // [two, four] 共用一块内存
	}

}
