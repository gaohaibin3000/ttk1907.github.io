public class Car{
    private String brand;
    private String color;
    private int price;

    //�޲ι���
    public Car(){

    }
    //����������
    public Car(String brand,String color,int price){
        setBrand(brand);
        setColor(color);
        setPrice(price);
    }
    //��ӡ������������Ϊ
    public void show(){
        System.out.println("Ʒ���ǣ�"+getBrand()+"����ɫ�ǣ�"+getColor()+"���۸��ǣ�"+getPrice());
    }
    //��ȡƷ�Ʋ����ص���Ϊ
    public String getBrand(){
        return brand;
    }
    //��ȡ��ɫ�����ص���Ϊ
    public String getColor(){
        return color;
    }
    //��ȡ�۸񲢷��ص���Ϊ
    public int getPrice(){
        return price;
    }
    //����Ʒ��Ϊ�����ƶ�����ֵ
    public void setBrand(String brand){
        this.brand = brand;
    }
    //������ɫΪ�����ƶ�����ֵ
    public void setColor(String color){
        this.color = color;
    }
    //���ü۸�Ϊ�����ƶ�����ֵ
    public void setPrice(int price){
        if (price>=0) {
            this.price = price;
        }else{
            System.out.println("�۸񲻺�������");
        }      
    }
    //ʵ�ּ۸�����1000Ԫ
    public void grow(){
        price+=1000;
    }
    //ʵ�ּ۸������������õ���ֵ
    public void grow(int price){
        this.price+=price;
    }

    public static void main(String[] args) {
        //ʹ���޲���ʽ��������ӡ����
        Car c1 = new Car();
        c1.show();
        //ʹ��������ʽ��������ӡ����
        Car c2 = new Car("����","��ɫ",200);
        c2.show();
        //���շ���ֵ
        String a = c2.getBrand();
        String b = c2.getColor();
        int c = c2.getPrice();
        System.out.println(a+"+"+b+"+"+c);
        //���ղ�������ֵ
        c2.setBrand("��G");
        c2.setColor("�׵�");
        c2.setPrice(2000000);
        c2.show();
        //ʵ�ּ۸�����
        c2.grow();
        c = c2.getPrice();
        System.out.println(c);
        c2.grow(1000000);
        c = c2.getPrice();
        System.out.println(c);
    }
}