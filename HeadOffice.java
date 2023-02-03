public abstract class HeadOffice
{
int amount1;
public void check_accounts(int amount)
{
int temp = amount;
System.out.println("checking account" +temp);
}
public int pay_tax(int amount)
{
this.amount1= amount;
return amount1;
}
public abstract void receive_Customers();
}
