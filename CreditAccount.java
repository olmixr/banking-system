package org.example;

public class CreditAccount extends BankAccount {

    private int creditLimit;
    private int monthlyFee;


    public CreditAccount(int accountNumber, String ownerName, int balance, int creditLimit, int monthlyFee) {
        super(accountNumber, ownerName, balance);
        this.creditLimit = creditLimit;
        this.monthlyFee = monthlyFee;
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Сумму которую вы снимаете должна быть больше нуля! ");
            return;
        }
        double newBalance = getBalance() - amount;
        if (newBalance<-creditLimit){
            System.out.println("Лимит кредита превышенна! ");
            return;
        }
        setBalance(newBalance);

    }

    @Override
    public void calculateMonthEnd() {
       setBalance(getBalance() - monthlyFee);
    }
    @Override
    public void getAccountInfo(){
        System.out.println("CreditAccount: ");
        super.getAccountInfo();
    }
}
