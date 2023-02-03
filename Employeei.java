class Employeei  implements Organization, Library
{

public static void main (String[] args)
{
Organization manager = new Employeei();
manager.apply_leave();
manager.work();
Library librarian = new Employeei();
librarian.lend();
librarian.return_book();
Employeei emp1 = new Employeei();
emp1.work();
emp1.apply_leave();
emp1.work();
emp1.apply_leave();
emp1.study();
System.out.println(emp1.leaves);
//emp1.leaves=100;
System.out.println(Employeei.leaves);
}
public void work()
{
System.out.println("Working");
}
public void apply_leave()
{
System.out.println("Developement");
}
public void lend()
{
System.out.println("Lending books");
}
public void return_book()
{
System.out.println("Returning books");
}
public void study()
{
System.out.println("Studying");
}
}
