public class Dog extends Pet{
    private String color;

    public Dog(){
        super();
    }
    public Dog(String name,int age,String color){
        super(name,age);
        setColor(color);
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("ëɫ��:"+getColor());
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("С��",5,"��ɫ");
        d1.show();
    }
}





















