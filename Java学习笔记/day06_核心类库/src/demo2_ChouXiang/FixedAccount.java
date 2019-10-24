package demo2_ChouXiang;

public class FixedAccount extends Account {
    public FixedAccount() {
    }

    public FixedAccount(double balance) {
        super(balance);
    }

    @Override
    public double lixi() {
        return getBalance()*0.003;
    }

    public static void main(String[] args) {
        Account ac = new FixedAccount(1000.0);
        double a=ac.lixi();
        System.out.println(a);
    }
}
