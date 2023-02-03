public class Child extends Parent
{

public static void main(String[] args)
{
Child childobj = new Child();
//childobj.grow();
//childobj.study();
//childobj.watch();
//childobj.work();
Parent parentobj = new Child();
parentobj.grow();// parent method
parentobj.study();//parent method
parentobj.watch();//parent method
parentobj.savings();
//parentobj.work();//Child method
Child ch = new Child();
System.out.println(ch instanceof Child);
System.out.println(parentobj instanceof Child);
}
public void work()
{
System.out.println("IT Professional");
}
public void study()
{
System.out.println("Higher Studies");
}
public void watch()
{
System.out.println("Web Series");
}

}
