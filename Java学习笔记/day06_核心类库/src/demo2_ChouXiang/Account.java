package demo2_ChouXiang;

public abstract class Account {
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        setBalance(balance);
    }


    public void setBalance(double balance) {

        this.balance = balance;
    }

    public double getBalance() {

        return balance;
    }

    public abstract double lixi();
}
