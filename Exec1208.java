class Account
{
    String name;
    int accountnumber;
    double balance;

    public Account(String n,int a,double b)
    {
        name=n;
        accountnumber=a;
        balance=b;
    }
    public double get_balance()
    {
        return balance;
    }
    public void withdraw(double amount)
    {
        if (amount>0 && amount<=balance)
        balance-=amount;
        else
        System.out.println("Invalid amount");
    }
}
public class Exec1208
{
    public static void main(String args[])
    {
        Account obj=new Account("Alice",1234,5000.0);
        obj.withdraw(3000.0);
        System.out.println("Account balance is:"+obj.get_balance());

        
    }
}