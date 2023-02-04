package tamilnadu.chennai;
public class CommonManInChennai implements TrafficRules
{
public static void main(String[] args)
{
CommonManInChennai cmc = new CommonManInChennai();
cmc.goByBicycle();
cmc.goByDieselVehicle();
}
public void goByDieselVehicle()
{
System.out.println("Go by Diesel vehicle");
}
public void goByBicycle()
{
System.out.println("Go by Bicycle");
}
}
