package india.newDelhi;
import tamilnadu.chennai.TrafficRules;
public class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules
{
public void dontGoByDieselVehicle()
{
System.out.println("Dont go by diesel vehicle");
}
public void goByBicycle()
{
System.out.println("Go by Bicycle");
}
public void goByDieselVehicle()
{
System.out.println("Go by Diesel vehicle");
}

public static void main(String[] args)
{
CommonManInDelhi cmd = new CommonManInDelhi();
cmd.goByBicycle();
cmd.dontGoByDieselVehicle();
cmd.goByDieselVehicle();
}
}
