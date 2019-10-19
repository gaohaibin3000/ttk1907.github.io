

public class Point{
    int x;
    int y;

    void show(){
        System.out.println(x+","+y);
    }
    void changeXY(int a,int b){
        x = a;
        y = b;
    }

    public static void main(String[] args) {
        Point p = new Point();
        p.show();

        System.out.println("--------------------------");
        p.x = 3;
        p.y = 5;
        p.show();
        System.out.println("--------------------------");
        p.changeXY(10,20);
        p.show();
    }
}














