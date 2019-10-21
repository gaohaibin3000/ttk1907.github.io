public class Car{
    private String brand;
    private String color;
    private int price;

    //无参构造
    public Car(){

    }
    //三参数构造
    public Car(String brand,String color,int price){
        setBrand(brand);
        setColor(color);
        setPrice(price);
    }
    //打印所有特征的行为
    public void show(){
        System.out.println("品牌是："+getBrand()+"，颜色是："+getColor()+"，价格是："+getPrice());
    }
    //获取品牌并返回的行为
    public String getBrand(){
        return brand;
    }
    //获取颜色并返回的行为
    public String getColor(){
        return color;
    }
    //获取价格并返回的行为
    public int getPrice(){
        return price;
    }
    //设置品牌为参数制定的数值
    public void setBrand(String brand){
        this.brand = brand;
    }
    //设置颜色为参数制定的数值
    public void setColor(String color){
        this.color = color;
    }
    //设置价格为参数制定的数值
    public void setPrice(int price){
        if (price>=0) {
            this.price = price;
        }else{
            System.out.println("价格不合理！！！");
        }      
    }
    //实现价格增长1000元
    public void grow(){
        price+=1000;
    }
    //实现价格增长参数设置的数值
    public void grow(int price){
        this.price+=price;
    }

    public static void main(String[] args) {
        //使用无参形式构造对象打印特征
        Car c1 = new Car();
        c1.show();
        //使用三参形式构造对象打印特征
        Car c2 = new Car("奔驰","黑色",200);
        c2.show();
        //接收返回值
        String a = c2.getBrand();
        String b = c2.getColor();
        int c = c2.getPrice();
        System.out.println(a+"+"+b+"+"+c);
        //按照参数设置值
        c2.setBrand("大G");
        c2.setColor("白的");
        c2.setPrice(2000000);
        c2.show();
        //实现价格增长
        c2.grow();
        c = c2.getPrice();
        System.out.println(c);
        c2.grow(1000000);
        c = c2.getPrice();
        System.out.println(c);
    }
}