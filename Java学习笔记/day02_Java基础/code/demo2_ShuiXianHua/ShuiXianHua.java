/*
 求水仙花数
 */


public class ShuiXianHua{
    public static void main(String[] args){

	for(int i = 99;i<1000;i++){
	    int b =i/100;
	    int c =i/10%10;
	    int d =i%10;
	    int e =b*b*b+c*c*c+d*d*d;
	    if(i==e){
		System.out.println("Ë®ÏÉ»¨Êý£º"+i);
	    }
	}
    }
}