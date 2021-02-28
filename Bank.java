


package javavko6th;

import java.util.ArrayList;
import java.util.Scanner;


public class Bank {
    private String accnumber;
    private int credamount;
    public int balance;
    public int wmoney;
    public int money;
    
    ArrayList<Object> Accounts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    
    
public void createAcc(){
    System.out.print("Give an account number: ");
    accnumber = sc.next();
    System.out.print("Amount of money to deposit: ");
    balance = sc.nextInt();
    System.out.println("Account created.");
    Account acc = new RegAcc(accnumber, balance);
    Accounts.add(acc);
}

public void createcredAcc(){
    System.out.print("Give an account number: ");
    accnumber = sc.next();
    System.out.print("Amount of money to deposit: ");
    balance = sc.nextInt();
    System.out.print("Give a credit limit: ");
    credamount = sc.nextInt();
    Account acc = new CredAcc(accnumber, balance, credamount);
    Accounts.add(acc);
    System.out.println("Account created.");
}

public void deleteAcc() {
    System.out.print("Give the account number of the account to delete: ");
    accnumber = sc.next();
    for (int i = 0; i<Accounts.size(); i++){
        Account acc = (Account)Accounts.get(i);
        if ((acc.getNumb()).equals(accnumber)){
            Accounts.remove(i);
            System.out.println("Account removed.");
        }
    }
}

public void srchAcc(){
    System.out.print("Give the account number of the account to print information from: ");
    accnumber = sc.next();
    for (int i = 0; i<Accounts.size(); i++){
        Account acc = (Account)Accounts.get(i);
        if ((acc.getNumb()).equals(accnumber)){
            System.out.println(acc.toString());
        }
    
}
}

public void deposit(){
    System.out.print("Give an account number: ");
    accnumber = sc.next();
    System.out.print("Amount of money to deposit: ");
    wmoney = sc.nextInt();
    for (int i = 0; i<Accounts.size(); i++){
        Account acc = (Account)Accounts.get(i);
        if ((acc.getNumb()).equals(accnumber)){
            balance = acc.getBalance();
            balance += wmoney;
            acc.setBalance(balance);
            
        }     
    }
}

public void withdraw(){
    System.out.print("Give an account number: ");
    accnumber = sc.next();
    System.out.print("Amount of money to withdraw: ");
    wmoney = sc.nextInt();
    for (int i = 0; i<Accounts.size(); i++){
        Account acc = (Account)Accounts.get(i);
        if ((acc.getNumb()).equals(accnumber)){
            acc.withdrawM(wmoney);
        }
        }
}
public void srchAll(){
    System.out.println("All accounts:");
    for (int i = 0; i<Accounts.size(); i++)
    {
    Account acc = (Account)Accounts.get(i);
    System.out.println(acc.toString());
    }
}
}