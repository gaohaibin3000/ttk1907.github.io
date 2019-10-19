/*
 编程实现两个数组之间的复制功能
 */

public class ArrFZ{
    public static void main(String[] args) {
        int[] aArr = new int[5];
        int[] bArr = {10,20,30,40,50};
        for (int i=0;i<aArr.length;i++ ) {
            aArr[i]=bArr[i];
            System.out.print(aArr[i]+" ");
        }
    }
}

















