package demo4_Student;


import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        System.out.println("请输入学生人数：");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Student[] arr = new Student[num];

        for (int i=0;i<num;i++){
            System.out.println("请以此填入学号，姓名，年龄");
           arr[i]=new Student(sc.next());
        }
        for (int i=0;i<num;i++){
            if (arr[i].getName().length()<5) {
            } else if (arr[i].getName().substring(0,5).equals("zhang")) System.out.println(arr[i]);
        }

    }
}
