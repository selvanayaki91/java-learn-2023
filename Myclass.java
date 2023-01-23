class Myclass
{
int num;
int no;
Myclass()
{
this.num=100;
}
Myclass(int num)
{
this.num=num;
}
Myclass(int num,int no)
{
this.num=num;
this.no = no;
}

public static void main(String[] args)
{
Myclass t1= new Myclass();
Myclass t2 = new Myclass();
Myclass t3 = new Myclass(90);
Myclass t4 = new Myclass(45,35);
System.out.println(t1.num  +"  "  + t2.num);
t3.collect();
t4.col();
System.out.println(t4.no);
System.out.println(t4.num);

}
void collect()
{
int num=60;
System.out.println(num);
System.out.println(this.num);
}
void col()
{
System.out.println(this.num);
System.out.println(this.no);

}

}
