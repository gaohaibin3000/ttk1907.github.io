/*
 ��ϰ����ʾ�û�����������������ʹ��if��֧�ṹ�ҵ����ֵ����ӡ����
 
 ʵ�ֲ��裺
	1.��ʾ�û���������������
	2.��������a��b
	3.��if��֧�ṹ�ж����ֵ����ӡ
 */

import java.util.Scanner;

public class IfTest{
    public static void main(String[] args){

	//1.��ʾ�û���������������
	System.out.println("����������������");

	//2.��������a��b
	Scanner sc = new Scanner(System.in);
	// int a = sc.nextInt();
	int b = sc.nextInt();
	
	//3.��if��֧�ṹ�ж����ֵ����ӡ
	/*
	if(a>b){
	System.out.println("���ֵ�ǣ�"+a);
	}
	if(a<b){
	System.out.println("���ֵ�ǣ�"+b);
	}
	if(a==b)
	{System.out.println("�������");}
	*/
	
	int max = sc.nextInt();
	if(b>max){
	    max = b;	
	}
	System.out.println("���ֵ�ǣ�"+max);
	
    }
}


























