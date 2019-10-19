/*
 提示用户输入4个整数并记录到a、b、c、d中，找出4个整数中的最大值打印出来
 */

import java.util.Scanner;

public class QiuMax{
    public static void main(String[] args){
	
	//提示用户输入4个整数并记录到a、b、c、d中
	System.out.println("请输入四个整数：");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	
	//找出4个整数中的最大值打印出来
	if(b>a){
	    a = b;
	}
	if(c>a){
	    a = c;
	}
	if(d>a){
	    a = d;
	}
	System.out.println("最大值是："+a);
    }
} 
























