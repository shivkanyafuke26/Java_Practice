import java.util.Scanner;

class Main {
    private String accountHolderName;
    private String address;
    private long aadharNumber;
    private String panNumber;
    private int upiPin;
    private double balance;
    private long phoneNumber;

    // Getter and Setter methods for all variables
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public int getUpiPin() {
        return upiPin;
    }

    public void setUpiPin(int upiPin) {
        this.upiPin = upiPin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Function to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid amount for deposit");
        }
    }

    // Function to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal");
        }
    }

    // Function to check balance
    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    // Function to display account information
    public void myInfo() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Aadhar Number: " + aadharNumber);
        System.out.println("PAN Number: " + panNumber);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main account = new Main();

        // Taking user input for account details
        System.out.print("Enter Account Holder Name: ");
        account.setAccountHolderName(scanner.nextLine());

        System.out.print("Enter Address: ");
        account.setAddress(scanner.nextLine());

        System.out.print("Enter Aadhar Number: ");
        account.setAadharNumber(scanner.nextLong());
        scanner.nextLine(); // Consume newline

        System.out.print("Enter PAN Number: ");
        account.setPanNumber(scanner.nextLine());

        System.out.print("Enter Phone Number: ");
        account.setPhoneNumber(scanner.nextLong());
        scanner.nextLine(); // Consume newline

        System.out.print("Enter UPI Pin: ");
        account.setUpiPin(scanner.nextInt());

        System.out.print("Enter Initial Balance: ");
        account.setBalance(scanner.nextDouble());

        int choice;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. My Info");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.myInfo();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
