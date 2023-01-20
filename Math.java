class Math
{

static String name;
 static int x;
 static int y;
long z;
long t;

public static void main(String[] args)
{
Math ma = new Math();

Math.name = "Selva";
name ="sai";

System.out.println(name);
//int asum= ma.sum();
int asum = Math.sum();
System.out.println(asum);
long ml = ma.mul();
System.out.println(ml);
}
static int sum(){
x=10;
y=98;
return x+y;
}
long mul()
{
z=98L;
t=70L;
return z*t;
}
}
