public class Zuoye{
    private String name;
    private int age;
    private static String country;

    public Zuoye(){

    }
    public Zuoye(String name,int age,String country){
        setName(name);
        setCountry(country);
        setAge(age);
    }
    public void show(){
        System.out.println("姓名："+getName()+"年龄："+getAge()+"国家："+getCountry());
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public void setAge(int age){
        this.age=age;
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

    public static void main(String[] args) {
        Zuoye zy1 = new Zuoye("ttk",18,"china");
        zy1.show();

        Zuoye zy2 = new Zuoye();
        zy2.show();
    }




}







































