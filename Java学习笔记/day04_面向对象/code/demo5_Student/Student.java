import java.util.Scanner;


public class Student{
    private int xuehao;
    private String name;
    private int age;

    public Student(){
        
    }
    public Student(int xuehao,String name,int age){
        setName(name);
        setAge(age);
        setXuehao(xuehao);
    }
    public void setName(String name){
        this.name=name;
    }
    public void setXuehao(int xuehao){
        if (xuehao>=0) {
            this.xuehao=xuehao;
        }else{
            System.out.println("������󣡣���");
        }
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getXuehao(){
        return xuehao;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println("������"+getName()+"���䣺"+getAge()+"ѧ�ţ�"+getXuehao());
    }
}


















