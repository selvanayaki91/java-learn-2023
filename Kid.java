package tamilnadu.chennai;
import tamilnadu.trichy.Mother;
 class Kid extends Mother
{
String name = "Suman";
public static void  main(String[] args)
{
Kid kid_obj = new Kid();
kid_obj.study();
}
public void work()
{
System.out.println("as a Sofware enginneer");
}
public void study()
{
super.work();
System.out.println(super.name);
System.out.println("I did enginneering");
}
}
