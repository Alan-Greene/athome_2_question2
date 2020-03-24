package lab2_question2;

public abstract class BankAccount {
    protected double balance;
    private String name;
    protected int number_of_withdrawals;
    protected int getNumber_of_deposits;

    public BankAccount(double balance, String name){
        this.balance = balance;
        this.name = name;
        this.number_of_withdrawals = 0;
        this.getNumber_of_deposits = 0;
    }

    public String getName() {
        return name;
    }

    public abstract void withdraw(double amount);

    public abstract double calculate_interest();
}
