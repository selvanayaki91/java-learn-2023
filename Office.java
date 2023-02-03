package tamilnadu.chennai;
// javac -d . Office.java

public /*final*/ class Office
{
private Office()
{
System.out.println("Parent - Zero Args");
}
private Office(int id)
{
System.out.println("parent- Single argument constructor");
}
static String name = "Abcd";
public /*final*/ int hike = 10;

public void go()
{
System.out.println("8to 3");
}
 public/* final */void work()
{
System.out.println("Working");
}
private void recruit()
{
System.out.println("Recruitment");
}
protected void plan_strategy()
{
System.out.println("Strategy");
}

public void pay_salary()
{
System.out.println("Getting paid");
}

}
