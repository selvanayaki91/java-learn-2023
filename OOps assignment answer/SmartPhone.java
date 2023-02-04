public abstract class SmartPhone
{
abstract int  call(int seconds);
abstract void  sendMessage();
abstract void receiveCall();
public void browse()
{
System.out.println("SmartPhone browsing");
}
public SmartPhone()
{
System.out.println("SmartPhone under development");
}
}
