package section09.Practice;

class BankAccount {
    String accountHolder;
    int balance;

    BankAccount(String accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}

class SwapBalance{
    void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("SwapBalance: a = %d, b = %d \n", a, b);
    }
}

class SwapAccount{
     void swap(BankAccount account1, BankAccount account2){
        int temp = account1.balance;
        account1.balance = account2.balance;
        account2.balance = temp;
        System.out.printf("SwapBalance: %s = %d, %s = %d \n",account1.accountHolder, account1.balance,account2.accountHolder, account2.balance);
    }
}


public class Practice0903 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("김일남", 10000);
        BankAccount account2 = new BankAccount("김이남", 20000);
        //  SwapBalance sb = new SwapBalance();
        SwapAccount sa = new SwapAccount();
 
        System.out.printf("swap 호출 전: %s: %d\n", account1.accountHolder, account1.balance);
        System.out.printf("swap 호출 전: %s: %d\n", account2.accountHolder, account2.balance);
        
        sa.swap(account1, account2);

        System.out.printf("swap 호출 후: %s: %d\n", account1.accountHolder, account1.balance);
        System.out.printf("swap 호출 후: %s: %d\n", account2.accountHolder, account2.balance);
    }
}
