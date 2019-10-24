package demo4_Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 =new Student(10,"ttk");
        System.out.println(s1);;

        System.out.println("-----------------------");
        Student s2 =new Student(11,"ktt");
        System.out.println(s1==s2);
        boolean b1 = s1.equals(s2);
        System.out.println("b1="+b1);

        System.out.println("-----------------------");

        String a1 = s1.toString();
        System.out.println("a1="+a1);
        System.out.println(a1);
    }
}
