import java.util.Scanner;
public class StudentTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ѧ������:");
        int num = sc.nextInt();
        Student[] arr = new Student[num];

        for (int i=0;i<num;i++) {
            System.out.println("����������,ѧ��,����,���䣺");
            arr[i]=new Student(sc.nextInt(),sc.next(),sc.nextInt());
        }
        System.out.println("-------------------------");
        for (int i=0;i<num;i++) {
            arr[i].show();
        }
    }
}






























