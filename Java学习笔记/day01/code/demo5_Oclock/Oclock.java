/*
 题目：提示用户输入整数类型的秒数，输出x小时x分x秒。
 如：输入7199，输出1小时59分59秒。

 实现步骤：
	1.获取用户输入的数值赋给变量t;
	2.通过运算得出小时，分钟，秒钟;
	3.将小时，分钟，秒钟赋给变量h，m，s并打印出来;
 */

import java.util.Scanner;

public class Oclock{
    public static void main(String[] args){

	System.out.println("请输入整数类型的秒数：");

	// 1.获取用户输入的数值赋给变量t;
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();

	//2.通过运算得出小时(h)，分钟(m)，秒钟(s);
	int h = t/3600;
	int m = t%3600/60;
	int s = t%3600%60;
	
	//3.将小时，分钟，秒钟赋给变量h，m，s并打印出来;
	System.out.println(h+"小时"+m+"分钟"+s+"秒钟");

    }
}