public class JieCheng{

    // int show(int n){
    //     int res = 1;
    //     for (int i=n;i>1;i--) {
    //         res*=i;
    //     }
    //     return res;
    // }

    int show(int n){
        if (n==1) {
            return 1;
        }
        return n*show(n-1);
    }

    public static void main(String[] args) {
        JieCheng j = new JieCheng();
        int a=j.show(5);     
        System.out.println("5µÄ½×³ËÊÇ:"+a);   
    }
}



























