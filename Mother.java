package tamilnadu.trichy;
import tamilnadu.palani.Grandma;
public class Mother extends Grandma
{
public String name = "Stella";
public void work()
{
System.out.println(super.name);
//System.out.println(this.name);
super.work();
System.out.println("Working as a teacher");
}

}
