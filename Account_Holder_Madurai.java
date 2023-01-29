package bank.madurai;
import bank.chennai.Sbi;

 class Account_Holder_Madurai extends Sbi
{

public static void main(String[] args)
{

Account_Holder_Madurai amobj= new Account_Holder_Madurai();

//System.out.println(Sbi.branch_name);
amobj.get_loan(500);
amobj.create_account();
}

}
