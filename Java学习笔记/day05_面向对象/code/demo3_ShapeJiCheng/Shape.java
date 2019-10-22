public class Shape{
    private int x;
    private int y;

    public Shape(){
        super();
    } 
    public Shape(int x,int y){
        setX(x);
        setY(y);
    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }

    public void show(){
        System.out.println("ºá×ø±ê£º"+getX()+"×Ý×ø±ê"+getY());
    }

    public static void main(String[] args) {
        Shape s = new Shape(1,2);
        s.show();
    }
}
























