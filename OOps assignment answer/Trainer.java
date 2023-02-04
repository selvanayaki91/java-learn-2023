public class Trainer
{
String dept = "Java";
String institute = "Payilagam";
private int salary = 10000;
public Trainer(String dname , String instname)
{
this.dept= dname;
this.institute = instname;
System.out.println("Dept   " + dept);
System.out.println("Institute   " + institute);
}
public int getsalary()
{
return this.salary;
}
void training()
{
System.out.println("Conduct Training");
}
public static void main(String[] args)
{
Trainer trainerKumar = new Trainer("CSE" , "Payilagam");
}
}
