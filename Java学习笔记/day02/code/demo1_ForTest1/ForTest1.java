/*
 练习：编程使用for循环实现10-1之间的所有整数的打印
*/


import java.util.Scanner;

public class ForTest1{
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println("-----------------------------");
	for(int i = 0;i<=a;i++){
	    System.out.println(i);
	
	}
    }
}
