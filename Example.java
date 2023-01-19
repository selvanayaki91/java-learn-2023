public class Example
{
public static void main(String[] args)
{
Example ex = new Example();
ex.exMethod();
int outcome = ex.subNumbers();
System.out.println(outcome);
int result = ex.mulNumbers();
System.out.println(result);
int div = ex.divNumbers();
System.out.println(div);
}
void exMethod()
{
System.out.println("We just called a method to print this!");
}

int subNumbers()
{
int x=57;
int y = 24;
return x-y;
}
int mulNumbers()
{
int x=45;
int y=9;
int z=8;
return x*y*z;
}
int divNumbers()
{
int x=98;
int y = 2;
int z=5;
return x/y*z;
}
}

output:
selva@selva-Lenovo-Edge-15:~/Music/B29$ javac Example.java
selva@selva-Lenovo-Edge-15:~/Music/B29$ java Example
We just called a method to print this!
33
3240
245
