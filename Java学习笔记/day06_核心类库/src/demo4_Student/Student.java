package demo4_Student;

public class Student {
    private int id;
    private  String name;

    public Student() {
        super();
    }

    public Student(int id, String name) {
        super();
        setId(id);
        setName(name);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if (id>=0){
            this.id = id;
        }else{
            System.out.println("不对！！！");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("我是"+getName()+",我的学号是"+getId());
    }
    public String toString(){
        return "Student[id = "+getId()+",name = "+getName()+"]";
    }
}



































