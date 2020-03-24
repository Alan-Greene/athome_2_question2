package lab2_question2;

public class CurrentAccount extends BankAccount {
    private double overdraft_amount;

    public CurrentAccount(double balance, String name, double overdraft_amount){
        super(balance, name);
        this.overdraft_amount = overdraft_amount;
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance + this.overdraft_amount > amount){
            this.balance -= amount;
            this.number_of_withdrawals++;
        } else {
            System.out.println("Insufficient funds to withdraw the amount.");
        }
    }

    @Override
    public double calculate_interest() {
        if (this.balance > 0){
            return this.balance * 0.05;
        } else  {
            return 0;
        }
    }
}
