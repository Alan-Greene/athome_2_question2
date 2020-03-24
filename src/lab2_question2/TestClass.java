package lab2_question2;

public class TestClass {

    public static void main(String[] args) {
        BankAccount[] bankAccounts = new BankAccount[4];

        bankAccounts[0] = new SavingsAccount(500, "John Smith", 10);
        bankAccounts[1] = new SavingsAccount(600, "Mary Jones", 10);
        bankAccounts[2] = new SpecialSavingsAccount(600, "Mary Smith", 10);
        bankAccounts[3] = new CurrentAccount(200, "John Jones", 200);

        for (BankAccount bank_account: bankAccounts ){
            bank_account.withdraw(300);
            System.out.println("Bank account: " + bank_account.getName());
            System.out.println("\tBalance: €" + bank_account.balance);
            System.out.println("\tNumber of withdrawals: " + bank_account.number_of_withdrawals);
            System.out.println("\tCalculate interest: €" + bank_account.calculate_interest());
            System.out.println();
        }

    }
}
