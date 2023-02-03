public class BikeRider
{

public static void main(String[] args)
{
PetrolBunk hp = new PetrolBunk();
//System.out.println(hp.petrol_price);
//System.out.println(hp.diesel_price);
//hp.petrol_price=50;
//hp.diesel_price=30;
//System.out.println(hp.petrol_price);
//System.out.println(hp.diesel_price);

int petrol = hp.get_petrol_price();
System.out.println(petrol);
int diesel = hp.get_diesel_price();
System.out.println(diesel);

hp.set_petrol_price(12000);
 petrol = hp.get_petrol_price();
System.out.println(petrol);


}

}
