/*
 1.˽�л���Ա����
 2.�ṩ�����Ƶ�get��set���������ڷ������м����к���ֵ�ж�
 3.�ڹ��췽���е���set�������к���ֵ�ж�
 */


public class Person {
    private String name;
    private String country;
    private int age;

    public Person(){
    }
    public Person(String name,String country,int age){
        setName(name);
        setCountry(country);
        setAge(age);
    }

    public void setName(String name){
        this.name=name;
    }
    public void setCountry(String country){
        this.country=country;
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
    public String getCountry(){
        return country;
    }
    public int getAge(){
        return age;
    }


}



















