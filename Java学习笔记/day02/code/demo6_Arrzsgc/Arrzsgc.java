/*
 练习：
    1.声明一个长度为5元素类型为int类型的一维数组，打印所有元素值
    2.使用10、20、30、40分别给数组中前四个位置元素赋值并打印所有元素
    3.将数据50插入到数组中下标为0的位置，原有元素向后移动再次打印
    4.将数据50从数组中删除，后续元素向前移动后再次打印所有元素
    5.查找数组中是否包含元素20，若包含将元素20改为200后再次打印所有
*/

public class Arrzsgc{
    public static void main(String[] args) {

        //1.声明一个长度为5元素类型为int类型的一维数组，打印所有元素值
        int[] arr = new int[5];
        for (int i=0;i<arr.length ;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
         System.out.println("-----------------------");
        //2.使用10、20、30、40分别给数组中前四个位置元素赋值并打印所有元素
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
        //3.将数据50插入到数组中下标为0的位置，原有元素向后移动再次打印
        for (int i=arr.length-1;i>0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=50;
        for (int i=0;i<arr.length ;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("-----------------------");
        //4.将数据50从数组中删除,后续元素向前移动后再次打印所有元素
        for (int i=0;i<arr.length-1;i++) {
            arr[i]=arr[i+1];    
        }
        arr[arr.length-1]=0;
        for (int i=0;i<arr.length ;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("-----------------------");
        //5.查找数组中是否包含元素20，若包含将元素20改为200后再次打印所有
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



















