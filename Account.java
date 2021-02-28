
package javavko6th;

public abstract class Account {
    //tiedot jolla alustetaan tilin ominaisuudet, eli tilinumero, rahamäärä, creditin määrä,
    private String accnumb;
    private int balance;
    

    public Account(){}
    public Account(String n, int b){
        this.accnumb = n;
        this.balance = b;
    }
    public int getBalance(){
            return balance;
        }
   public String getNumb(){
            return accnumb;
        }
   public void setBalance(int b){
       balance = b;
   }
   
   public void depositM(int m){
       balance += m;
   }
   public void withdrawM(int m){
       if (balance < m){
           System.out.println("Account out of balance.");
       }
       else {
           balance -= m;
       }
   }
   
   
   public String toString()
   {
       return("Account number: "+accnumb+" Amount of money: "+balance);
   }
    }

