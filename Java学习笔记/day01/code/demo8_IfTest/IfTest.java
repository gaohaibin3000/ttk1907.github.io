/*
 练习：提示用户输入两个正整数，使用if分支结构找到最大值并打印出来
 
 实现步骤：
	1.提示用户输入两个正整数
	2.赋给变量a，b
	3.用if分支结构判断最大值并打印
 */

import java.util.Scanner;

public class IfTest{
    public static void main(String[] args){

	//1.提示用户输入两个正整数
	System.out.println("请输入两个正整数");

	//2.赋给变量a，b
	Scanner sc = new Scanner(System.in);
	// int a = sc.nextInt();
	int b = sc.nextInt();
	
	//3.用if分支结构判断最大值并打印
	/*
	if(a>b){
	System.out.println("最大值是："+a);
	}
	if(a<b){
	System.out.println("最大值是："+b);
	}
	if(a==b)
	{System.out.println("两数相等");}
	*/
	
	int max = sc.nextInt();
	if(b>max){
	    max = b;	
	}
	System.out.println("最大值是："+max);
	
    }
}


























