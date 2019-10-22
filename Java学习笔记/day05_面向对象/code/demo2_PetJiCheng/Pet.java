public class Pet{
    //私有化成员变量
    private String name;
    private int age;
    //无参构造
    public Pet(){
        
    }
    //有参构造
    public Pet(String name,int age){
        setName(name);
        setAge(age);
    }
    //成员方法
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age>=0 && age<150) {
            this.age=age;
        }else{
            System.out.println("输入错误！！！");
        }
    }
    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println("姓名:"+getName()+"年龄:"+getAge());
    }

    public static void main(String[] args) {
        Pet p1 = new Pet("lalala",2);
        p1.show();
    }

}























