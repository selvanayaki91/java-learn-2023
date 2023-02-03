package bank.chennai;

 class Account_Holder
{

public static void main(String[] ags)
{
String empName="Selva";
String empId="as120";
Sbi sbiobj = new Sbi();
System.out.println(Sbi.branch_name);
sbiobj.create_account();
System.out.println(empName);
System.out.println(empId);
sbiobj.get_loan(1000);
}

}
