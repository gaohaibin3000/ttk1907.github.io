/*
 编程实现Worker的封装
 */


public class Worker extends Person{
    private int salary;

    public Worker(String name,int age,int salary){
        setName(name);
        setAge(age);
        setSalary(salary);
    }
    public Worker(){
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        if (salary>=2120) {
            this.salary=salary;
        }else{
            System.out.println("薪资不合理！");
        }
    }
    public void work(){
        System.out.println("正在努力的搬砖");
    }

    @Override
    public void show(){
        super.show();
        System.out.println("，我一个月能挣"+getSalary()+"呢");
    }



    public static void main(String[] args) {

        Worker w1 = new Worker();
        Worker w2 = new Worker("ttk",18,30000);
        w1.show();
        w2.show();
        w2.eat("豆芽");
        w2.play("王者荣耀");
        w2.work();

    }
    
}


















