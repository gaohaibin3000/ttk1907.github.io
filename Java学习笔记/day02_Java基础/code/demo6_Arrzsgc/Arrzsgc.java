/*
 ��ϰ��
    1.����һ������Ϊ5Ԫ������Ϊint���͵�һά���飬��ӡ����Ԫ��ֵ
    2.ʹ��10��20��30��40�ֱ��������ǰ�ĸ�λ��Ԫ�ظ�ֵ����ӡ����Ԫ��
    3.������50���뵽�������±�Ϊ0��λ�ã�ԭ��Ԫ������ƶ��ٴδ�ӡ
    4.������50��������ɾ��������Ԫ����ǰ�ƶ����ٴδ�ӡ����Ԫ��
    5.�����������Ƿ����Ԫ��20����������Ԫ��20��Ϊ200���ٴδ�ӡ����
*/

public class Arrzsgc{
    public static void main(String[] args) {

        //1.����һ������Ϊ5Ԫ������Ϊint���͵�һά���飬��ӡ����Ԫ��ֵ
        int[] arr = new int[5];
        for (int i=0;i<arr.length ;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
         System.out.println("-----------------------");
        //2.ʹ��10��20��30��40�ֱ��������ǰ�ĸ�λ��Ԫ�ظ�ֵ����ӡ����Ԫ��
        for (int i=0;i<arr.length ;i++) {
            if (i==arr.length-1) {
                System.out.print(arr[i]+" ");
                break;
            }
            arr[i]=10*(i+1);           
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("-----------------------");
        //3.������50���뵽�������±�Ϊ0��λ�ã�ԭ��Ԫ������ƶ��ٴδ�ӡ
        for (int i=arr.length-1;i>0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=50;
        for (int i=0;i<arr.length ;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("-----------------------");
        //4.������50��������ɾ��,����Ԫ����ǰ�ƶ����ٴδ�ӡ����Ԫ��
        for (int i=0;i<arr.length-1;i++) {
            arr[i]=arr[i+1];    
        }
        arr[arr.length-1]=0;
        for (int i=0;i<arr.length ;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("-----------------------");
        //5.�����������Ƿ����Ԫ��20����������Ԫ��20��Ϊ200���ٴδ�ӡ����
        for (int i=0;i<arr.length ;i++) {
            if(arr[i]==20){
                arr[i]=200;
            }
        }
        for (int i=0;i<arr.length ;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}



















