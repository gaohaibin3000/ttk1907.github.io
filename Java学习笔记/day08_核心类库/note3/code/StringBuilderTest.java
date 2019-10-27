package cn.itxdl.day13;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// 1.构造StringBuilder类型的对象来描述字符串内容
		StringBuilder sb1 = new StringBuilder("ABCD");
		// 2.对字符串内容进行处理并记录
		// 方式一：直接将逗号插入到字符串的指定位置
		/*
		sb1.insert(1, ",");    //A,BCD 
		sb1.insert(3, ",");    //A,B,CD
		sb1.insert(5, ",");    //A,B,C,D
		
		for(int i = 1; i <= 5; i += 2) {
			sb1.insert(i, ",");
		}
		*/
		// 方式二：取出字符串中的每个字符然后拼接逗号保存到另外一个对象中
		StringBuilder sb2 = new StringBuilder();
		for(int i = 0; i < sb1.length(); i++) {
			//sb2.append(sb1.charAt(i)).append(",");
			if(sb1.length()-1 == i) {
				sb2.append(sb1.charAt(i));
			} else {
				sb2.append(sb1.charAt(i)).append(",");
			}
		}
		// 删除最后多余的逗号
		//sb2.deleteCharAt(sb2.length()-1);
		
		// 3.打印最终的处理结果 ctrl+alt+上下方向键 拷贝代码
		//System.out.println("sb1 = " + sb1); // A,B,C,D
		System.out.println("sb2 = " + sb2); // A,B,C,D

	}

}
