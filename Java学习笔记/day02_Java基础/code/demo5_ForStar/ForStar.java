/*
 打印星星
 */

public class ForStar{
    public static void main(String[] args){
    
	for(int i=1;i<6;i++){
	    for(int j=1;j<=i;j++){
		System.out.print("*");
	    }
	    System.out.println();	
	}
	
	System.out.println("------------------------");

	for(int i=1;i<=6;i++){
	    for(int j=5;j>=i;j--){
		System.out.print("*");
	    }
	    System.out.println();	
	}

	System.out.println("------------------------");

	for(int i=1;i<10;i+=2){
	    for(int a=8;a>=i;a-=2){
		System.out.print(" ");
	    }
	    for(int j=1;j<=i;j++){
		System.out.print("*");
	    }
	    System.out.println();	
	}



    }
}
