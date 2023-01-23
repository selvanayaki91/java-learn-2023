class Employee
{

 static int salary;

static int bonoce;

Employee(int salary)
{
this.salary = salary;
}

Employee(int salary , int bonoce )
{
this.postal();
this.salary = salary;
this.bonoce = bonoce;

}

Employee()
{

System.out.println("Welcome Employees");
}
public static void main(String[] args)

{

Employee employee1 = new Employee(1000);
Employee employee2 = new Employee(2000);
Employee employee3 = new Employee(3000,4000);
Employee employee4 = new Employee();


employee1.bring();
employee3.postal();


}
void bring()

{
int salary = 500;
System.out.println(salary);
System.out.println(this.salary);

}

void postal()
{
int salary = 800;
System.out.println(salary);
System.out.println(this.salary);
System.out.println("Bonoce is "  + this.bonoce);
}
}
