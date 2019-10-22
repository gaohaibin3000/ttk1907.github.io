public class TestShape{

    public static void draw(Shape s){
        s.show();
    }

    public static void main(String[] args) {
        TestShape.draw(new Rect(1,2,3,4));        
        TestShape.draw(new Circle(1,2,3));        
    }
}
































