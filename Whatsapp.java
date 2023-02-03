class Whatsapp

{
private int profit = 30;;
int otp;
public static void main(String[] args)
{
Whatsapp wh = new Whatsapp();
wh.send_msg();
wh.call();
wh.collect_data();
System.out.println(wh.profit);
//wh.group_call();
//wh.set_status();
//wh.receive_call();
//wh.bloc();
}
void send_msg()
{
System.out.println("Sending text");
}

void call()
{

System.out.println("pick my call");
}
private void collect_data()

{
System.out.println("collecting data");

}

}
