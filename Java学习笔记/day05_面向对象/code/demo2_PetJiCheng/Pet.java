public class Pet{
    //˽�л���Ա����
    private String name;
    private int age;
    //�޲ι���
    public Pet(){
        
    }
    //�вι���
    public Pet(String name,int age){
        setName(name);
        setAge(age);
    }
    //��Ա����
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
            System.out.println("������󣡣���");
        }
    }
    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println("����:"+getName()+"����:"+getAge());
    }

    public static void main(String[] args) {
        Pet p1 = new Pet("lalala",2);
        p1.show();
    }

}























