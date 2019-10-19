/*
 出租车计费方式：由里程数和等候时间钱数相加得出
 里程数前3公里10元，超过3公里到15公里部分每公里2元，15公里以上部分每公里三元
 等候时间每2分半1元，不足部分不要钱
 输入公里数和等候秒数，输出车费
 */

import java.util.Scanner;

public class CheFei{
    public static void main(String[] args){

	// 1.获取公里数和秒数
	System.out.println("请输入公里和秒数");
	Scanner sc = new Scanner(System.in);
	int gl = sc.nextInt();
	int t = sc.nextInt();

	// 2.分段计算
	int cf = 0;
	if(gl<=3){
	    cf = 10+t/150;
	}else if(gl<=15){
	    cf = 10+(gl-3)*2+t/150;
	}else if(gl>15){
	    cf = 34+(gl-15)*3+t/150;
	}
	//3.输出车费
	System.out.println("您花费了"+t+"秒，走了"+gl+"公里，车费一共是"+cf+"元");
    }
}






















