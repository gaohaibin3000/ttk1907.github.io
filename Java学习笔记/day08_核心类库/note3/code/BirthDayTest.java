package cn.itxdl.day13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BirthDayTest {

	public static void main(String[] args) throws Exception {
		
		// 1.��ʾ�û�����ָ���ĸ�ʽ����������Ϣ��ʹ�ñ�����¼
		System.out.println("��������������(xxxx��xx��xx��)��");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		
		// 2.����������Ϣ����1970��1��1��0ʱ0��0�����������¼
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		// ʵ��String������Date���͵�ת��
		Date d1 = sdf.parse(str1);
		// ��ȡ���������;���1970��1��1�յĺ�����
		long msec = d1.getTime();
		// ���ݺ���������������
		long day = (msec/1000/3600+ 8)/24;
		
		// 3.��ӡ���յĽ��
		System.out.println("�����������Ӿ���1970��1��1���Ѿ���ȥ" + day + "���ˣ�");
	}

}
