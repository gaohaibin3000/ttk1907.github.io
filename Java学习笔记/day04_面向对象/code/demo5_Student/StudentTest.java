import java.util.Scanner;
public class StudentTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生个数:");
        int num = sc.nextInt();
        Student[] arr = new Student[num];

        for (int i=0;i<num;i++) {
            System.out.println("请依次填入,学号,姓名,年龄：");
            arr[i]=new Student(sc.nextInt(),sc.next(),sc.nextInt());
        }
        System.out.println("-------------------------");
        for (int i=0;i<num;i++) {
            arr[i].show();
        }
    }
}






























