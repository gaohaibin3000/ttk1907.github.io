/*
 提示用户输入一个整数，使用关系运算符判断该整数是否为负数
 若是则打印true，否则打印false
 
 实现步骤：
	1.提示用户输入一个整数
	2.使用关系运算符判断该整数是否大于0
	3.若是则打印true，否则打印false
 */

import java.util.Scanner;

public class Gxys{
    public static void main(String[] args){

	//1.提示用户输入一个整数
	System.out.println("请输入一个整数");

	//2.使用关系运算符判断该整数是否大于0
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();	
	if(t>=0)
	{System.out.println("true");}	
	else
	{System.out.println("false");}		
    }
}

















