public class Checking extends Account {

    Checking() {
        setBalance(0.00);
    }

    @Override
    public double withdraw(double amount) {
        setBalance(getBalance() - amount);
        if (getBalance() < 0.00) {
            System.out.println("Charging an overdraft fee of $20 because account is below $0.");
            setBalance(getBalance() - 20);
            return getBalance();
        }
        return getBalance();
    }
}
