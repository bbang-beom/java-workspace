package section08;

public class BankOOP {
    public static class BankAccount {
        int balance;

        public BankAccount() {
            this.balance = 0;
        }

        public  void deposit(int amount) {
            balance += amount;
        }
    
        public  void withdraw(int amount) {
            balance -= amount;
        }
    
        public  void printBalance() {
            System.out.println("잔액: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.deposit(1000);
        account1.printBalance();
        account1.deposit(1000);
        account1.printBalance();

        System.out.println();

        BankAccount account2 = new BankAccount();
        account2.deposit(10000);
        account2.printBalance();
        account2.deposit(5000);
        account2.printBalance();

        System.out.println();

        BankAccount account3 = new BankAccount();
        account3.deposit(3000);
        account3.printBalance();
        account3.deposit(2000);
        account3.printBalance();

    }
}
