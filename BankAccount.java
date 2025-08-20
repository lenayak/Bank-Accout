import java.time.LocalDateTime;

public class BankAccount {
   private String ownerName;
   private int balance;
    private LocalDateTime opened;
    private boolean isBlocked;

    public BankAccount(String ownerName){
        this.ownerName = ownerName;
        this.balance = 0;
        this.opened = LocalDateTime.now();
        this.isBlocked = false;
        System.out.println("New account: \n\tName: " + this.ownerName + "\n\topened: " + this.opened + "\n");
    }
    
  public boolean deposit(int amount) {
        if (isBlocked) {
            System.out.println("Account blocked");
            return false;
        }
        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return false;
        }
        balance += amount;
        System.out.println("Account " + this.ownerName + " has been replenished on " + amount);
        return true;
    }

    public boolean withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return false;
        }
        if (balance < amount) {
            System.out.println("Insufficient funds");
            return false;
        }
        if (isBlocked) {
            System.out.println("Account blocked");
            return false;
        }
        balance -= amount;
        System.out.println("Account " + this.ownerName +  " withdrawn " + amount);
        return true;
    }

     public boolean transfer (BankAccount otherAccount, int amount){
        if (equals(otherAccount)){
            System.out.println("Accounts are equals");
            return false;
        }
        if (balance < amount ) {
            System.out.println("Insufficient funds");
            return false;
        }
        if (otherAccount.isBlocked) {
            System.out.println("Recipient's account blocked");
            return false;
        }
        if (isBlocked) {
            System.out.println("Account blocked");
            return false;
        }
        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return false;
        }
        balance -= amount;
        otherAccount.balance += amount;
        System.out.println(amount + " transferred from " + this.ownerName + " to " + otherAccount.ownerName);
        return true;
     }

     public boolean equals(BankAccount otherAccount){
        if(this.ownerName != otherAccount.ownerName){
            return false;
        }
        else if(this.balance != otherAccount.balance){
            return false;
        }
        else if(this.opened != otherAccount.opened){
            return false;
        }
        else if(this.isBlocked != otherAccount.isBlocked){
            return false;
        }
        return true;
     }
}