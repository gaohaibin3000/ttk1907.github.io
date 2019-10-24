package demo3_JieKou;

public class ClassA implements InterfaceA {

    @Override
    public int method(int n) {
        int a=0;
        for (int i=0;i<=n;i++){
            a+=i;
        }
        return a;
    }

    public static void main(String[] args) {
        InterfaceA it = new ClassA();
        int a = it.method(5);
        System.out.println(a);
    }
}
