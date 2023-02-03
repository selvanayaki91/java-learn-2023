class Constructor1
{
Constructor1()
{
System.out.println("Hello");
}
Constructor1(int a)
{
int temp= a;
System.out.println("The values is :" + temp);
}
//Constructor1(int b)
//{
//int temp1= b;
//System.out.println("The values is :" + temp1);
//} cannot be defined one more time
Constructor1(String name)
{
String x= name;
System.out.println("The values is" +x);
}
public static void main(String[] ars)
{
Constructor1 obj1 = new Constructor1();
Constructor1 obj2 = new Constructor1(10);
Constructor1 obj3 = new Constructor1(50);
Constructor1 obj4 = new Constructor1("selva");
}

}
