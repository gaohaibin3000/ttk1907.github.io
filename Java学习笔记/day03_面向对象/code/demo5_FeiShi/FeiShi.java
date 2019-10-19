public class FeiShi{

 //    int feiShi(int n){
	// if(n==1){
	//     return 1;
	// }
	// if(n==2){
	//     return 1;	
	// }
	// return feiShi(n-1)+feiShi(n-2);
 //    }

 //    public static void main(String[] args){
 //    	FeiShi fs = new FeiShi();
 //    	int num = fs.feiShi(30);
 //    	System.out.println("×îÖÕ½á¹ûÊÇ£º"+num);
 //    }
    void feiShi(int n){
        int a = 1, b=1, c = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println("第" + i + "等于" + a);
            }else if (i == 2) {
                System.out.println("第" + i + "等于" + b);
            }else {
                c = a+b;
                a = b;
                b = c;
                System.out.println("第" + i + "等于" + c);
            }
        }
    }
    public static void main(String[] args) {
        FeiShi fs = new FeiShi();
        fs.feiShi(5);
    }


 

}