package demo3_JieKou;

public class ClassB implements InterfaceA {

    @Override
    public int method(int n) {
        if (n==1 || n==2){
            return 1;
        }
        return method(n-1)+method(n-2);
    }

    public static void main(String[] args) {
        InterfaceA it = new ClassB();
        int a = it.method(10);
        System.out.println(a);
    }
}
