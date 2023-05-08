import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        Account a1 = new Account("0001", "Omar", 4000);
        System.out.println("Welcome " + a1.getName());
        System.out.println("Your ID is : " + a1.getId());
        System.out.println("Your current balance is: " + a1.getBalance());
        a1.credit();
        //a1.transferTo(a1, 0);
        a1.debit();
        System.out.println(a1.toString());

        Account a2 = new Account("0002", "Ali", 6000);
        System.out.println("Welcome " + a2.getName());
        System.out.println("Your ID is : " + a2.getBalance());
        System.out.println("Your current balance is: " + a2.getBalance());
        System.out.println("Enter amount to transfer to another account:  ");
        int amount=data.nextInt();
        a1.transferTo(a2,amount);
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        // Exercise 1 Account

      Employee e1 = new Employee("0003","Wid",500000);
        System.out.println("Welcome " + e1.getName());
        System.out.println("Your ID is : " + e1.getId());
        System.out.println( "Your annual salary in a year is : " + e1.getAnualSalary());
        System.out.println("This is your salary after raised by 10 % " + e1.raisedSalary());
        System.out.println(e1.toString());

        //Exercise 2 Employee
    }

}