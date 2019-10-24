package demo3_JieKou;

public class TestInterface {

    public static void show(InterfaceA a){
       int b =a.method(15);
        System.out.println(b);
    }

    public static void main(String[] args) {

        TestInterface.show(new ClassA());
        TestInterface.show(new ClassB());

    }
}
