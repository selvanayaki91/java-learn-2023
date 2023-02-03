package tamilnadu.madurai;
import tamilnadu.chennai.Office;//canonical name
// javac -d . Branch_Office.java
// java tamilnadu.madurai.Branch_Office

public /*final*/class Branch_Office extends Office
{
public Branch_Office()
{
System.out.println("Child - Zero Args");
}
public Branch_Office(int id)
{
//super();// by default irukum..invisible aka..
super(id);
System.out.println("Child- Single argument constructor");
}
//public int hike =20;
final int salary = 25000;
public static void main(String[] args)

{
Branch_Office manager = new Branch_Office(1234);
System.out.println(manager.hike);
//manager.salary=30000;
//manager.hike = 30;
manager.work();
//manager.pay_salary();
//manager.promote();
//manager.recruit();
//manager.plan_strategy();
//Office off_obj = new Office();
//off_obj.work();
//manager.go();
}

public void promote()
{
System.out.println("Marketing");
}
//overridden method
 public void work()
{
System.out.println(super.hike);
System.out.println(this.hike);
super.work();
super.plan_strategy();
System.out.println("Dev and Testing");
}
public void go()
{
super.go();
System.out.println("11to1");
}
}
