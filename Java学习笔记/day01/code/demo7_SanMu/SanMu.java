/*
 ��ϰ����ʾ�û�����������������ʹ����Ŀ������ҵ����ֵ����ӡ����
 
 ʵ�ֲ��裺
	1.��ʾ�û���������������
	2.��������a��b
	3.����Ŀ������ж����ֵ����ӡ
 */

import java.util.Scanner;

public class SanMu{
    public static void main(String[] args){

	//1.��ʾ�û���������������
	System.out.println("����������������");

	//2.��������a��b
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	//3.����Ŀ������ж����ֵ����ӡ
	System.out.println(a>b?a:b);
    }
}


























