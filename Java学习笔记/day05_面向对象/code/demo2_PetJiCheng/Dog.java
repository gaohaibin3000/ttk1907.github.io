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
        System.out.println("毛色是:"+getColor());
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("小明",5,"黑色");
        d1.show();
    }
}





















