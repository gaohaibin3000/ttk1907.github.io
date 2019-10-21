public class Singleton{
    private static Singleton(){}

    private Singleton sin = new Singleton();

    public static Singleton getInstance(){
        return sin;
    }

}





































