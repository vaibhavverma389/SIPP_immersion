package accountinfo;
public class  bank{
    private int balance=500;
    String name;
    private  int accountno;
    public int withdral(int amount)
    {
        return balance-amount;
    }
    public int deposit(int amount){
        return balance+amount;
    }
    public int checkbalance()
    {
        return  balance;
    }

}