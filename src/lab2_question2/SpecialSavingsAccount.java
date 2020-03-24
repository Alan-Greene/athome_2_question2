package lab2_question2;

public class SpecialSavingsAccount extends SavingsAccount{

    public SpecialSavingsAccount(double balance, String name, double interest_rate){
        super(balance, name, interest_rate);
    }

    @Override
    public double calculate_interest() {
        return super.calculate_interest() + 250;
    }
}
