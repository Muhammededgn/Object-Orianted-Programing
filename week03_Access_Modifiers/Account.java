package week03_Access_Modifiers;

public class Account {
    private String name;
    private Double balance;
    private int password=1234;

    public Account(String name,Double balance){
        this.name=name;
        this.balance=balance;
    }
    public void setOwnerName(String name){
        this.name=name;
    }
    public void getOwnerName(){
        System.out.println(name);
    }
    public double getBalance(){
        return balance;
    }
    public void add(Double deposit){
        balance = balance+deposit;
    }
    public void withdraw(Double amount){
        if(balance>=amount){
            balance = balance-amount;
            System.out.println("You are successfully withdrawn your money.");
        }
        else
            System.out.println("You don't have enough money.");

    }
    public int isTrue(int a){
        if(a==password)
            return 1;
        else
            return 0;
    }
}
