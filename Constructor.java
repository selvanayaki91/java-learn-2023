class Constructor
{
Constructor()
{
System.out.println("Hello");
}
Constructor(int a)
{
int temp= a;
System.out.println("The values is :" + temp);
}

Constructor(int b)
{
int temp1= b;
System.out.println("The values is :" + temp1);
}
Constructor(String name)
{
String x= name;
System.out.println("The values is" +x);
}
public static void main(String[] ars)
{
Constructor obj1 = new Constructor();
Constructor obj2 = new Constructor(10);
Constructor obj3 = new Constructor(50);
Constructor obj4 = new Constructor("selva");
}

}
