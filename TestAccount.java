/** This class demonstartes object orientated programming
 *
 */

import java.util.Date;
class Account{
    private int id;
    private double balance;
    private double interestRate;
    private Date date;
    public Account(){
        id=1122;
        balance=10000;
        interestRate=0;
        date= new Date();
    }
    public Account(int id, double balance, double interestRate){
        this.id=id;
        this.balance=balance;
        this.interestRate=interestRate;
        date= new Date();
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public Date getDate(){
        return date;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }
    public double getMonthlyInterestRate(){
        return (interestRate/100) /12;
    }
    public double getMonthlyBalance(){
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        setBalance(getBalance()-amount);
    }
    public void deposit(double amount){
        setBalance(getBalance()+amount  );
    }
}
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1222, 20000, 4.5);
        account.withdraw(2300);
        account.deposit(3000);
        System.out.println( "The Balance is " +account.getBalance()+" and int is "+account.getMonthlyBalance()+" and the date is"+ account.getDate());
    }
}
