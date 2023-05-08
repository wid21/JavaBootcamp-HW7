import java.util.Scanner;

public class Account {
private String id ;
private String name ;
private int balance ;
    public Account() {
    }
    public Account (String id , String name ){
        this.id=id;
        this.name=name;
    }
    public Account(String id,String name, int balance) {
       this.name=name;
       this.id=id;
       this.balance=balance;
    }
    Scanner data = new Scanner(System.in);
    public int debit () {
        System.out.println("Enter the amount to debit:");
        int amount = data.nextInt();
        if (amount > 0) {
            balance += amount;
            System.out.println("Transfer successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount entered.");
        }
        return balance;
    }

    public int transferTo(Account a2 , int amount){
        if (balance < amount) {
            System.out.println("Do not have enough money to transfer. Current balance: " + balance);
        }
         else {
            balance -= amount;
            a2.balance += amount;
            System.out.println("Transfer successful, New balance for " + name + ": " + balance);

        }
         return amount;
    }


    public int credit(){
        System.out.println("Enter the amount to credit:");
        int amount = data.nextInt();
            if (balance < amount) {
                System.out.println("Do not have enough money to debit. Current balance: " + balance);
            } else {
                balance -= amount;
                System.out.println("Credit successful. New balance: " + balance);
            }

        return balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account " +
                "Id ='" + id + '\'' +
                ", name ='" + name + '\'' +
                ", balance =" + balance ;
    }
}
