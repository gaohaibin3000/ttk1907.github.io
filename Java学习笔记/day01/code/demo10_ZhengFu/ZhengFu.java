/*
 判断用户输入的整数是正数、负数还是零并打印。
 */

import java.util.Scanner;

public class ZhengFu{
    public static void main(String[] args){
	
	System.out.println("请输入一个整数:");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	if(a>0){
	    System.out.println("该整数是正数");
	}else if(a<0){
	    System.out.println("该整数是负数");
	}else{
	    System.out.println("该整数是0");
	}
    }
}





















