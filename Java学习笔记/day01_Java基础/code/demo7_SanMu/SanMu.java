/*
 练习：提示用户输入两个正整数，使用三目运算符找到最大值并打印出来
 
 实现步骤：
	1.提示用户输入两个正整数
	2.赋给变量a，b
	3.用三目运算符判断最大值并打印
 */

import java.util.Scanner;

public class SanMu{
    public static void main(String[] args){

	//1.提示用户输入两个正整数
	System.out.println("请输入两个正整数");

	//2.赋给变量a，b
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	//3.用三目运算符判断最大值并打印
	System.out.println(a>b?a:b);
    }
}



























