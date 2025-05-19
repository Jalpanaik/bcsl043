class Account
{
    private String name;
    private int accountNumber;
    private double balance;
    private String addressString;
    private String accountType;


public Account(String n, int number, double bal)
{
    name=n;
    accountNumber=number;
    balance=bal;
}
public Account(String n, int a, double b, String add,String t)
{
    name=n;
    accountNumber=a;
    balance=b;
    addressString=add;
    accountType=t;
}
public double get_balance()
{
    return balance;
}
public void deposite (double amount)
{
    if (amount>0)
    {
        balance+=amount;
    }
    else
    {
        System.out.println("Invalid deposite amount");
    }
}
public void withdraw(double amount)
{
    if (amount>0 && amount<=balance)
    {
        balance-=amount;
    }
    else
    {
        System.out.println("Invalid amount");
    }
}
}
public class s5 {
    public static void main(String[] args) {
        Account obj=new Account("Bob", 500, 3000.0, "123 street", "Savings");
        Account obj1=new Account("Alice", 1001, 5000.0);

        obj.withdraw(500.0);
        obj1.deposite(1500.0);

        System.out.println("balance in Bob's account"+ obj.get_balance());
        System.out.println("Alice's balance"+obj1.get_balance());
    }
    
}
