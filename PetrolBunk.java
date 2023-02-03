public class PetrolBunk
{
private int petrol_price=104;
 private int diesel_price=100;

//getter method
public int get_petrol_price()
{
return this.petrol_price;
}
 public int get_diesel_price()
{
return this.diesel_price;
}

public void set_petrol_price(int ltrs)
{
if(ltrs>10000)
{
this.petrol_price=103;
}
}
}
