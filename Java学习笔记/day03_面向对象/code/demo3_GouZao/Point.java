public class Point{
    int x;
    int y;
    Point(){
    }
    Point(int a,int b){
        x = a;
        y = b;
    }
    void show(){
        System.out.println(x+","+y);
    }
    public static void main(String[] args) {
        System.out.println(",");
        Point p1 = new Point();
        p1.show();
        Point p2 = new Point(10,20);
        p2.show();

    }
}















