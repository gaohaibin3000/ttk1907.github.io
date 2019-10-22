public class Gold implements Money,Metal{
    @Override
    public void buy(){
        System.out.println("买了好多好吃的");
    }

    @Override
    public void shine(){
        System.out.println("发出了闪亮的光");
    }

    public static void main(String[] args) {
        Metal mt = new Gold();
        mt.shine();
        Money mn = new Gold();
        mn.buy();
    }
}















