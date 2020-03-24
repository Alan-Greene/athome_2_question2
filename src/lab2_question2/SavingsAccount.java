package lab2_question2;

public class SavingsAccount extends BankAccount {
    private boolean active;
    private double interest_rate;

    public SavingsAccount(double balance, String name, double interest_rate){
        super(balance, name);

        this.active = !(this.balance < 25);
        this.interest_rate = interest_rate;
    }

    @Override
    public void withdraw(double amount) {
        if (this.active){
            this.balance -= amount;
            this.number_of_withdrawals++;
        }

        if (this.balance < 25){
            this.active = false;
        }
    }

    @Override
    public double calculate_interest() {
        if (this.balance > 0){
            return this.balance * (interest_rate / 100);
        } else  {
            return 0;
        }
    }
}
