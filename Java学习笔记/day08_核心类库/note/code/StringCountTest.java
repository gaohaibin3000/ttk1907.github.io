package cn.itxdl.day13;

public class StringCountTest {

	public static void main(String[] args) {
		
		// 1.构造String类型的对象描述字符串"ABCD123!@#$%ab"
		String str1 = new String("ABCD123!@#$%ab");
		// 2.准备一个长度为4元素类型为int类型的一维数组
		int[] arr = new int[4];
		
		// 3.循环取出字符串中的每个字符进行判断并记录到数组中
		for(int i = 0; i < str1.length(); i++) {
			char tc = str1.charAt(i);
			// 当该字符是大写字母时，则在大写字母的个数上加1
			if(tc >= 'A' && tc <= 'Z') {
				arr[0]++;
			}
			// 当该字符是小写字母时，则在小写字母的个数上加1
			else if(tc >= 'a' && tc <= 'z') {
				arr[1]++;
			}
			// 当该字符是数字字符时，则在数字字符的个数上加1
			else if(tc >= '0' && tc <= '9') {
				arr[2]++;
			}
			// 其它字符
			else {
				arr[3]++;
			}
		}
		
		// 4.打印最终的统计结果
		System.out.println("大写字母出现了" + arr[0] 
				+ "次，小写字母出现了" + arr[1] + "次，数字字符出现了" 
				+ arr[2] + "次，其它字符出现了" + arr[3] + "次！");// 4 2 3 5
	}

}
