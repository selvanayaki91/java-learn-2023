public class SQLTrainer extends Trainer
{
public SQLTrainer()
{
super("CSE" , "Payilagam");
}
public static void main(String[] args)
{
SQLTrainer ram = new SQLTrainer();
//super();
//System.out.println("dept  " + ram.dept);
//System.out.println("institute  " + ram.institute);
ram.training();
int salary = ram.getsalary();
System.out.println(salary);
}
}
