/*
 ��Ŀ����ʾ�û������������͵����������xСʱx��x�롣
 �磺����7199�����1Сʱ59��59�롣

 ʵ�ֲ��裺
	1.��ȡ�û��������ֵ��������t;
	2.ͨ������ó�Сʱ�����ӣ�����;
	3.��Сʱ�����ӣ����Ӹ�������h��m��s����ӡ����;
 */

import java.util.Scanner;

public class Oclock{
    public static void main(String[] args){

	System.out.println("�������������͵�������");

	// 1.��ȡ�û��������ֵ��������t;
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();

	//2.ͨ������ó�Сʱ(h)������(m)������(s);
	int h = t/3600;
	int m = t%3600/60;
	int s = t%3600%60;
	
	//3.��Сʱ�����ӣ����Ӹ�������h��m��s����ӡ����;
	System.out.println(h+"Сʱ"+m+"����"+s+"����");

    }
}