/*
 获取用户输入的字符赋给变量名
 */

import java.util.Scanner;

public class VarIO{
    public static void main(String[] args){
	/*声明变量*/
	// String name;
	// int age;
	/*提示用户输入*/	
	System.out.println("请输入姓名和年龄");
	/*获取用户输入的姓名和年龄赋给变量*/
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	int age = sc.nextInt();
	System.out.println("name :"+name);
	System.out.println("age :"+age);
    }

}














