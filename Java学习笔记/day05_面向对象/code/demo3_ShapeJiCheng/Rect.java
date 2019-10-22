public class Rect extends Shape{
    private int l;
    private int h;

    public Rect(){
        super();
    }
    public Rect(int x,int y,int l,int h){
        super(x,y);
        setL(l);
        setH(h);
    }

    public void setL(int l){
        this.l=l;
    }
    public int getL(){
        return l;
    }
    public void setH(int h){
        this.h=h;
    }
    public int getH(){
        return h;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("³¤¶È£º"+getL()+"¿í¶È£º"+getH());
    }
    public static void main(String[] args) {
        Rect r = new Rect(1,2,10,20);
        r.show();
    }

}





































