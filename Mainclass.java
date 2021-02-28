
package javavko6th;


import java.util.Scanner;

public class Mainclass {

    public static void main(String[] args) {
        
       int choice;
       Bank b = new Bank();
       
       Scanner sc = new Scanner(System.in);
       while (true){
        System.out.println("\n*** BANK SYSTEM ***");
        System.out.println("1) Add a regular account");
        System.out.println("2) Add a credit account");
        System.out.println("3) Deposit money");
        System.out.println("4) Withdraw money");
        System.out.println("5) Remove an account");
        System.out.println("6) Print account information");
        System.out.println("7) Print all accounts");
        System.out.println("0) Quit");
        System.out.print("Your choice: ");
        choice = sc.nextInt();
        
        if (choice == 0)
        {
        break;
        }
        else if (choice == 1)
        {
            b.createAcc();
        }
        else if (choice == 2)
        {
            b.createcredAcc();
        }
        else if (choice == 3)
        {
            b.deposit();
        }
        else if (choice == 4)
        {
            b.withdraw();
        }
        else if (choice == 5)
        {
           b.deleteAcc();
           
        }
        else if (choice == 6)
        {
            b.srchAcc();
        }
        else if (choice == 7)
        {
            b.srchAll();
        }
        else {
            System.out.println("Invalid choice.");
        }
    }
    
}
}
