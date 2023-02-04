public class TamilNadu extends SouthIndia
{
static String capital = "Chennai";
public TamilNadu()
{
super();
}
void cultivate()
{
System.out.println("Rice and Sugar cane cultivation");
}
void livingStyle()
{
System.out.println("Above Average development");
}
void speakLanguage()
{
System.out.println("Speaking language tamil");
}
void eat()
{
System.out.println("I like rice and chicken");
}
void dress()
{
System.out.println("I Like Indian dresses");
}
public static void main(String[] args)
{
SouthIndia si = new TamilNadu();
System.out.println(India.capital);
System.out.println(TamilNadu.capital);
System.out.println(si.capital);
//TamilNadu tn = new TamilNadu();
}
}
