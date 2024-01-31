public class BankAccount {
    private double amount;
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        if(amount>this.balance){
            throw new IllegalArgumentException("Amount exceeds balance");
        }else{
            this.balance += amount;
        }
    }
}