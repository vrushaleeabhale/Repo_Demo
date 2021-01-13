package Assignments;

 class ConstructorOverloading
{
int id;
String name;
ConstructorOverloading(int i,String n)
{
	id=i;
	name=n;
}
void display()
{
	System.out.println(id+" "+name);
}


public static void main(String [] args)
{
	
	ConstructorOverloading c1=new ConstructorOverloading(1,"vrushali");
	ConstructorOverloading c2=new ConstructorOverloading(2,"arti");

	c1.display();
	c2.display();

}
}
