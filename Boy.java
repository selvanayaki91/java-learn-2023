public class Boy
{
Boy boy1;
public static void main(String[] args)
{
//Boy boy1 ithukum memory creat akum so atha kuraika we use this  = new Boy();
//new Boy()= Anonymous Object
//String s = new Boy().enquire();
//System.out.println(s);
System.out.println(new Boy().enquire());//composition of method
}

String enquire()
{
Boy boy1;
return "correct address";
}
}
