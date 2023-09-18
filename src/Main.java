import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account myCheckings = new Checking();
        Savings mySavings = new Savings();
        int input;
        do {
            System.out.println("1. Withdraw from Checking\n" +
                    "2. Withdraw from Savings\n" +
                    "3. Deposit to Checking\n" +
                    "4. Deposit to Savings\n" +
                    "5. Balance of Checking\n" +
                    "6. Balance of Savings\n" +
                    "7. Award Interest to Savings now\n" +
                    "8. Quit");

            switch (input = sc.nextInt()) {
                case 1:
                    System.out.println("Enter withdrawal amount");
                    myCheckings.withdraw(sc.nextDouble());
                    System.out.println("Money withdrawn");
                    System.out.println("You now have " + myCheckings.getBalance() + " in the account.");
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount");
                    mySavings.withdraw(sc.nextDouble());
                    System.out.println("Money withdrawn");
                    break;
                case 3:
                    System.out.println("Enter deposit amount");
                    myCheckings.deposit(sc.nextDouble());
                    System.out.println("Money deposited");
                    System.out.println("You now have " + myCheckings.getBalance() + " in the account.");
                    break;
                case 4:
                    System.out.println("Enter deposit amount");
                    mySavings.deposit(sc.nextDouble());
                    System.out.println("Money deposited");
                    break;
                case 5:
                    System.out.println(myCheckings.getBalance());
                    break;
                case 6:
                    System.out.println(mySavings.getBalance());
                    break;
                case 7:
                     mySavings.interest();
                    break;
                case 8:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }
        while (input != 8);
    }
}