/*Use of super keyword in multi-level Inheritance and constructor */

class BaseOne1
{
	int no1;
	BaseOne1(int value)
	{
		no1 = value;
	}
}
class ChildOne1 extends BaseOne1
{
	int no2;
	ChildOne1(int num1, int num3)
	{
		super(num1);
		no2 = num3;
	}
}
class ChildOne2 extends ChildOne1
{
	int no3;
	ChildOne2(int num1,int num2,int num3)
	{
		super(num1,num3);
		no3 = num2;
	}
	void display()
	{
		System.out.println("Base class variable value = "+no1);
		System.out.println("Intermediate class variable value = "+no2);
		System.out.println("Child class variable value = "+no3);
	}
}
class DemoOne11
{
	public static void main(String args[])
	{
		ChildOne2 ob = new ChildOne2(10,20,30);
		ob.display();
	}
}