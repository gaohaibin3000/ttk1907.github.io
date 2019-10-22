/*
 1.私有化成员变量
 2.提供公有制的get和set方法，并在方法体中及逆行合理值判断
 3.在构造方法中调用set方法进行合理值判断
 */


public class Person {
    private String name;
    private int age;

    public Person(){
    }
    public Person(String name,int age){
        setName(name);
        setAge(age);
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if (age>=0 && age<=150) {
            this.age=age;
        }else{
            System.out.println("年龄不合理");
        } 
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println("我是"+getName()+",我今年"+getAge()+"岁了");
    }

    public void eat(String food){
        System.out.println(food+"真好吃");
    }
    public void play(String game){
        System.out.println(game+"真好玩");
    }

}



















