package cn.itxdl.day13;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		// 1.提示用户输入学生人数并使用变量记录
		System.out.println("请输入学生人数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.根据学生人数准备一个一维数组
		Student[] arr = new Student[num];
		
		// 3.提示用户输入每个学生的信息并记录到一维数组中
		for(int i = 0; i < num; i++) {
			System.out.println("请输入第" + (i+1) + "个学生的信息(学号,姓名,年龄)：");
			String str1 = sc.next();
			System.out.println(str1);
			// 将用户输入的学生信息进行拆分，打印出来
			String[] sArr = str1.split(",");
			System.out.println("sArr[0] = " + sArr[0]);
			System.out.println("sArr[1] = " + sArr[1]);
			System.out.println("sArr[2] = " + sArr[2]);
			// 将读取到的每个学生信息放入到一维数组
			arr[i] = new Student(Integer.parseInt(sArr[0]), 
					sArr[1], Integer.parseInt(sArr[2]));
		}
		
		System.out.println("-------------------------------");
		// 4.打印所有姓zhang的学生
		for(int i = 0; i < num; i++) {
			if(arr[i].getName().startsWith("zhang")) {
				System.out.println(arr[i]);
			}
		}
	}

}
