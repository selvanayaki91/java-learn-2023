class CopyConstructor
{
int xid;
String sname;
int yid;
String yname;

CopyConstructor(int id , String name)
{
this.xid =id;
this.sname= name;
System.out.println(xid);
System.out.println(sname);
}
CopyConstructor(CopyConstructor c)
{
this.yid= c.xid;
this.yname= c.sname;
System.out.println(yid);
System.out.println(yname);
}
public static void main(String[] args)
{
CopyConstructor obj1 = new CopyConstructor(101,"Selva");
CopyConstructor obj2 = new CopyConstructor(obj1);
}
}
