abstract class Abst
{
Abst()
{
System.out.println("great");

}
abstract void absmethod(){
}
void concretemethod()
{
System.out.println("hi");
}
}
class Subclass extends Abst
{
void absmethod()
{
System.out.println("welcome");
}
}
class Main
{
public static void main(String[] args)
{
Subclass s=new Subclass();
s.absmethod();
s.concretemethod();
}
}