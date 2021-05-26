class Dog
{
    String name;
    int age;

public Dog(String name,int age)
{
    this.name=name;
    this.age=age;
}
public void getname()
{
   System.out.println(name);
}
public void getage()
{
   System.out.println(age);
}
public static void main(String a[])
{
   Dog tuffy=new Dog("tuffy",5);
   Dog tuffy1=new Dog("tuffy1",4);
   Dog tuffy2=new Dog("tuffy2",15);
   tuffy.getname();
   tuffy.getage();
   tuffy1.getname();
   tuffy1.getage();
   tuffy2.getname();
   tuffy2.getage();
 }
}