public class Samsung extends FactoryDemo
{
static int price = 5000;
public  void  verifyFingerPrint()
{
System.out.println("Verifying finger print");
}
public  void  providePattern()
{
System.out.println("providing pattern");
}
 int  call(int seconds)
{
return seconds;
}
void  sendMessage()
{
System.out.println("sending message");
}
void receiveCall()
{
System.out.println("Received call");
}
public static void main(String[] args)
{
Samsung sam = new Samsung();
sam.browse();
System.out.println("The Price is " + sam.price);
System.out.println("The Price  " + FactoryDemo.price);
sam.receiveCall();
sam.sendMessage();
sam.call(60);
sam.providePattern();
sam.verifyFingerPrint();
}
}
