package tamilnadu.chennai;
//javac -d . Office.java
//javac -d . Employee1.java
//java tamilnadu.chennai.Employee1
class Employee1
{

public static void main(String[] args)
{
Office office = new Office();
office.work();
office.pay_salary();
office.plan_strategy();
//office.recruit();
Employee1 emp = new Employee1();
emp.study();

}

void study()
{
System.out.println("Graduation");
}

}
