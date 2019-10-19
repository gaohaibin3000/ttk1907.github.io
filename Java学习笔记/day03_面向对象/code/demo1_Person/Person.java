 // 编程实现Person类的定义


public class Person{
    String name;
    int age;

    //自定义成员方法，打印所有特征的量
    void show(){
        System.out.println("我是"+name+",我今年"+age+"啦");
    }
    void change(String a){
        name = a;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "张飞";
        p.age = 18;
        System.out.println(p.name+","+p.age);
        System.out.println("-------------------------------");
        p.show();
        p.change("刘备");
        p.show();
    }
}

































