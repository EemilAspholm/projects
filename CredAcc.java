/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavko6th;


public class CredAcc extends Account{
    private int credit;
    private int money;
        public CredAcc(String n, int b, int c){
            super(n, b);
            credit = c;
        }
        public int getCredit(){
            return credit;
        }
        public void setCredit(int c){
            credit = c;
        }
        
       public String toString(){
           return(super.toString()+" credit limit: "+credit);
       }
       @Override
       public void withdrawM(int m){
           if (super.getBalance() < m && (super.getBalance()+credit) < m){
               System.out.println("Account out of balance");
           }
           else if(super.getBalance()> m){
               super.withdrawM(m);
            }
           else {
               money = super.getBalance();
               credit -= m;
               if (credit < 0){
                   money += credit;
                   setCredit(0);
                   super.setBalance((money));
               }
               
           }
           
       }     
}
