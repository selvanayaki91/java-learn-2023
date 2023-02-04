public class SivaKumar implements Actor
{
static String address = "Coimbatore";
int age;
String carname;
public SivaKumar()
{
System.out.println("Hello");
}
SivaKumar(int age, String cname)
{
this.age = age;
this.carname = cname;
System.out.println("Age is  " +age);
System.out.println("The Car Name is " + carname);
}
public static void main(String[] ars)
{
SivaKumar as = new SivaKumar(65, "Audi Car");
as.act();
as.dance();
as.sing();
as.speak();
System.out.println("The address is  " +address);
Actor ac = new SivaKumar();
ac.act();
ac.sing();
ac.dance();
System.out.println(Actor.address);

}
public void act()
{
System.out.println("Acting");
}
public void dance()
{
System.out.println("Dancing");
}
public void sing()
{
System.out.println("singing");
}
public void speak()
{
System.out.println("Speaking");
}
}
