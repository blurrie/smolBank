public class Savings extends Account{
    Savings(){
        setBalance(0.00);
    }
    @Override
    public double withdraw(double amount) {
        setBalance(getBalance() - amount);
        if (getBalance() < 500.0) {
            System.out.println("Charging a fee of $10 because account is below $500.");
            setBalance(getBalance() - 10);
            return getBalance();
        }
        return getBalance();
    }
    @Override
    public double deposit(double amount){
        int count = 0;
        setBalance(amount + getBalance());
        count++;
        System.out.println("This is deposit " + count + " to this account.");
        if (count > 5){
            System.out.println("Charging a fee of $10");
            setBalance(getBalance() - 10);
        }
        return getBalance();

    }
    public void interest(){
        double bal = getBalance();
        double interest = .015;
        double earned = bal * interest;
        System.out.println("Customer earned " + earned + " in interest.");
        setBalance(earned + bal);

    }
}
