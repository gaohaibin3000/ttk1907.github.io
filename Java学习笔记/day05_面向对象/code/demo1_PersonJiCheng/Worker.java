/*
 ���ʵ��Worker�ķ�װ
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
            System.out.println("н�ʲ�����");
        }
    }
    public void work(){
        System.out.println("����Ŭ���İ�ש");
    }

    @Override
    public void show(){
        super.show();
        System.out.println("����һ��������"+getSalary()+"��");
    }



    public static void main(String[] args) {

        Worker w1 = new Worker();
        Worker w2 = new Worker("ttk",18,30000);
        w1.show();
        w2.show();
        w2.eat("��ѿ");
        w2.play("������ҫ");
        w2.work();

    }
    
}


















