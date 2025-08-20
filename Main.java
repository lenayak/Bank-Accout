public class Main {
    public static void main(String[] var){
        BankAccount acc1 = new BankAccount("Harry");
        BankAccount acc2 = new BankAccount("James");

        System.out.println( "\nDeposit:");
        acc1.deposit(-5);
        acc1.deposit(500);
        System.out.println("\nWithdraw:");
        acc1.withdraw(-25);
        acc1.withdraw(10000);
        acc1.withdraw(150);
        System.out.println("\nTransfer:");
        acc1.transfer(acc2, 1120);
        acc1.transfer(acc2, -5);
        acc1.transfer(acc1, 10);
        acc1.transfer(acc2, 300);

        System.out.println( "\nDeposit:");
        acc2.deposit(-10);
        acc2.deposit(750);
        System.out.println("\nWithdraw:");
        acc2.withdraw(-65);
        acc2.withdraw(10000);
        acc2.withdraw(250);
        System.out.println("\nTransfer:");
        acc2.transfer(acc1, 2500);
        acc2.transfer(acc1, -100);
        acc2.transfer(acc2, 100);
        acc2.transfer(acc1, 200);
    }
}
