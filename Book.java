class Book
{
 static int price;

int discount;
Book(int price)//single argument constructor
{
this(); // new Book(); constructor calling
this.price =price;
}

Book(int price , int discount)//two argument constructor
{
this();
this.price = price;
this.discount = discount;
}

Book()
{
System.out.println("Welcomes to Readers Club");
}
public static void main(String[] args)
{
Book book1 = new Book(50);
Book book2 = new Book(30);
Book book3 = new Book(1000,500);
Book book4 = new Book();
book1.sell();
book3.sell();
}
void sell()
{
int price = 45;
System.out.println(price);
System.out.println(this.price);
System.out.println("Discount is " + this.discount);


}
}
