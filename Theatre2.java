class Theatre2
{
int amount ;

Theatre2(int amount)
{
this.amount = amount;
int ticket_amount=120;
int balance = amount - ticket_amount;
System.out.println(balance);
}
public static void main(String[] args)
{
Theatre2 raja = new Theatre2(200);
}

}
