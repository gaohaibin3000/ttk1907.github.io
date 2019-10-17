/*
 提示用户输入下落时间，根据下面的公式计算下落的位移并打印出来。
 自由落体的公式为： 0.5 * 9.8 * t * t	
 实现步骤：
	1.提示用户输入下落的时间
	2.获取下落的时间赋给变量t
	3.根据公式计算下落的位移
	4.打印出下落的位移 
 */

import java.util.Scanner;
 
public class ZiYou{
    public static void main(String[] args){
	System.out.println("请输入下落的时间");
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	double h = 0.5 * 9.8 * t * t;
	System.out.println("下落的位移是：" + h);
    }
} 
 
 