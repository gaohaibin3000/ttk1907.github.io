public class Circle extends Shape{
    private int r;

    public Circle(){
        super();
    }
    public Circle(int x,int y,int r){
        super(x,y);
        setR(r);
    }

    public void setR(int r){
        this.r=r;
    }
    public int  getR(){
        return r;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("°ë¾¶£º"+getR());
    }

    public static void main(String[] args) {
        Circle c = new Circle(1,2,5);
        c.show();
    }
}



































