/*
 1.私有化成员变量
 2.提供公有制的get和set方法，并在方法体中及逆行合理值判断
 3.在构造方法中调用set方法进行合理值判断
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
            System.out.println("年龄不合理");
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



















