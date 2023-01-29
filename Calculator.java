class Calculator
{
static String owner = "Selva";
public static void main(String[] args)
{
Calculator calc = new Calculator();//local reference
int no1=100, no2=200;
int result =calc.add(no1,no2);//method calling statement
 int answer = calc.sub(no1,no2);
calc.add(100,20.5f);
calc.add(100,200,300);
int sum = Calculator.add(17,15,13,15);
System.out.println(sum);

}
static int  add(int a, int b, int c,int d) //static method so no need create a object
{

return a+b+c+d;
}
void add(int no1, int no2, int no3)
{
System.out.println(no1+no2+no3);
}
void add(int no1, float no2)
{
System.out.println(no1+no2);
}
int add(int a,int b)
{
System.out.println(a+b);
return a+b;
}
int sub(int a, int b)
{
System.out.println(a-b);
  return a-b;
}
}
