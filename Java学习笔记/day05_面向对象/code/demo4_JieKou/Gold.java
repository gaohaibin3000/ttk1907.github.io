public class Gold implements Money,Metal{
    @Override
    public void buy(){
        System.out.println("���˺ö�óԵ�");
    }

    @Override
    public void shine(){
        System.out.println("�����������Ĺ�");
    }

    public static void main(String[] args) {
        Metal mt = new Gold();
        mt.shine();
        Money mn = new Gold();
        mn.buy();
    }
}















