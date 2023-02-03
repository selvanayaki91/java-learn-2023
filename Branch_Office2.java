package tamilnadu.erode;
import tamilnadu.chennai.Office;//canonical name
// javac -d . Branch_Office2.java
// java tamilnadu.madurai.Branch_Office2

public class Branch_Office2 extends Office
{

public static void main(String[] args)

{
Branch_Office2 manager = new Branch_Office2();
manager.work();
manager.pay_salary();
manager.promote();
//manager.recruit();
manager.plan_strategy();
}
public void promote()
{
System.out.println("Marketing");
}
}
