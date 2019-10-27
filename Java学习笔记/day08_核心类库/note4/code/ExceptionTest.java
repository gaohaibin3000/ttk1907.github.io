package cn.itxdl.day14;

public class ExceptionTest {

	public static void main(String[] args) {
		
		//Thread.sleep(1000); //表示睡眠1秒  检测性异常
		int ia = 10;
		int ib = 0;
		System.out.println(ia / ib); // 非检测性异常
		
		System.out.println("程序结束了！");
	}

}
