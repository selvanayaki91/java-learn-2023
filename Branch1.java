public class Branch1 extends Branch_Plan
{

public  void receive_Customers()
{
System.out.println("received customers");
}
public static void main(String[] args)
{
Branch1 branch = new Branch1();
branch.check_accounts(100);
int ca =branch.pay_tax(2000);
System.out.println(ca);
branch.do_interview();
branch.receive_Customers();

}

}
