/*
 不断的提示用户输入聊天内容并输出，直到用户输入"bye"结束聊天。
 */

import java.util.Scanner;

public class LiaoTian{
    public static void main(String[] args){

	//²»¶ÏµÄÌáÊ¾ÓÃ»§ÊäÈëÁÄÌìÄÚÈÝ
	for(int i=1;i==1;){
	    System.out.println("ÇëÊäÈëÁÄÌìÐÅÏ¢£º");
	    Scanner sc = new Scanner(System.in);
	    String a = sc.next();

	//Êä³öÁÄÌìÄÚÈÝ
	    System.out.println("--------------------------------");
	    System.out.println(a);

	//Ö±µ½ÓÃ»§ÊäÈë"bye"½áÊøÁÄÌì¡£
	    if(a.equals("bye")){
		System.out.println("ÁÄÌì½áÊø");
		break;
	    }
	}
	
    }
}



















