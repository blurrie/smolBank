public class Account {
    private static int acc_num;
    private static double balance;
     Account(){
        balance = 0.00;
        acc_num = 10001;
    }

    public int getAcc_num(){
        return acc_num;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        Account.balance = balance;
    }

    public double withdraw(double amount){
        setBalance(balance - amount);
        return amount;
    }
    public double deposit(double amount){
         setBalance(amount + balance);
        return amount;
    }
}
