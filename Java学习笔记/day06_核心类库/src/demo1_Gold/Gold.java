package demo1_Gold;

public class Gold implements Metal,Money {

    @Override
    public void shine() {
        System.out.println("发出闪亮的光芒");
    }

    @Override
    public void buy() {
        System.out.println("买了好多好吃的");
    }

    public static void main(String[] args) {
        Metal mt = new Gold();
        Money mn = new Gold();
        mt.shine();
        mn.buy();
    }
}
