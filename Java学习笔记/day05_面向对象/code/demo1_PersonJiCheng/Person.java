/*
 1.˽�л���Ա����
 2.�ṩ�����Ƶ�get��set���������ڷ������м����к���ֵ�ж�
 3.�ڹ��췽���е���set�������к���ֵ�ж�
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
            System.out.println("���䲻����");
        } 
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println("����"+getName()+",�ҽ���"+getAge()+"����");
    }

    public void eat(String food){
        System.out.println(food+"��ó�");
    }
    public void play(String game){
        System.out.println(game+"�����");
    }

}



















