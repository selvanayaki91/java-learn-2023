class SuperMarket
{
static String shop_name = "ABCD";
String product_name;
int product_price;
boolean expired;
float discount;


SuperMarket(String product_name, int product_price)
{
//System.out.println("Selva");
//product_name = s;
//product_price = i;
this.product_name = product_name;
this.product_price = product_price;


}

public static void main(String[] args)
{
SuperMarket product1 = new SuperMarket(" biscuit", 30);
SuperMarket product2 = new SuperMarket(" bread", 40);



//SuperMarket product3 = new SuperMarket("noodles", 50);
//product1.product_name ="biscuit";
//product1.product_price =30;

//product2.product_name ="bread";
//product2.product_price =30;
product1.sell();
product2.pack();
//System.out.println(product1.expired);
//System.out.println(product2.discount);



}
void sell()
{
System.out.println("Selling" +product_name +  " " + product_price);
}

void pack()
{
System.out.println("Packing" + product_name +  " " + product_price);
}

}
