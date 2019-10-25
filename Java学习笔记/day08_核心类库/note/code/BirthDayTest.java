package cn.itxdl.day13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BirthDayTest {

	public static void main(String[] args) throws Exception {
		
		// 1.提示用户按照指定的格式输入生日信息并使用变量记录
		System.out.println("请输入您的生日(xxxx年xx月xx日)：");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		
		// 2.计算生日信息距离1970年1月1日0时0分0秒的天数并记录
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		// 实现String类型向Date类型的转换
		Date d1 = sdf.parse(str1);
		// 获取该日期类型距离1970年1月1日的毫秒数
		long msec = d1.getTime();
		// 根据毫秒数来计算天数
		long day = (msec/1000/3600+ 8)/24;
		
		// 3.打印最终的结果
		System.out.println("您出生的日子距离1970年1月1日已经过去" + day + "天了！");
	}

}
