 // ���ʵ��Person��Ķ���


public class Person{
    String name;
    int age;

    //�Զ����Ա��������ӡ������������
    void show(){
        System.out.println("����"+name+",�ҽ���"+age+"��");
    }
    void change(String a){
        name = a;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "�ŷ�";
        p.age = 18;
        System.out.println(p.name+","+p.age);
        System.out.println("-------------------------------");
        p.show();
        p.change("����");
        p.show();
    }
}

































