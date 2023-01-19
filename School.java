class School
{
public static void main(String[] args)
{
School petTeacher = new School();
// petTeacher trains students .
petTeacher.train();//method calling statement
int account=petTeacher.collect_fees();
System.out.println("Total amount is " +account);

}
 void train()
//School.java:9: error: invalid method declaration; return type required
// train() method name
// void train() method signature

{//method Body or Method Definition
System.out.println("Training Students");
}
int collect_fees()
{
int fees1=50;
int fees2=50;
int fees3=50;
return fees1+fees2+fees3;
//System.out.println("Collect fees");
}

}
