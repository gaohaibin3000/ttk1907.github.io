/*
 ��ʾ�û���������ʱ�䣬��������Ĺ�ʽ���������λ�Ʋ���ӡ������
 ��������Ĺ�ʽΪ�� 0.5 * 9.8 * t * t	
 ʵ�ֲ��裺
	1.��ʾ�û����������ʱ��
	2.��ȡ�����ʱ�丳������t
	3.���ݹ�ʽ���������λ��
	4.��ӡ�������λ�� 
 */

import java.util.Scanner;
 
public class ZiYou{
    public static void main(String[] args){
	System.out.println("�����������ʱ��");
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	double h = 0.5 * 9.8 * t * t;
	System.out.println("�����λ���ǣ�" + h);
    }
} 
 
 