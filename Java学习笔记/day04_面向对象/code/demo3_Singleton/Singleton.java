public class Singleton{
    private Singleton(){}

    private static Singleton sin = new Singleton();

    public static Singleton getInstance(){
        return sin;
    }

}





































