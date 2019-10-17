/*
 逆序输出三位数
 */

import java.util.Scanner;

public class Nixu{
    public static void main(String[] args){

	
	System.out.println("请输入三位整数：");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b =a/100;
	int c =a/10%10;
	int d =a%10;
	int e =d*100+c*10+b;
	System.out.println("逆序输出结果为:"+e);
    }
}