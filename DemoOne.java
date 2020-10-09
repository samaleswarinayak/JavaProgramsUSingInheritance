/*Use of super keyword in Inheritance and constructor */

class BaseOne
{
	int no1;
	BaseOne(int value)
	{
		no1 = value;
	}
}
class ChildOne extends BaseOne
{
	int no2;
	ChildOne(int num1, int num2)
	{
		super(num1);
		no2 = num2;
	}
	void display()
	{
		System.out.println("Base class variable value = "+no1);
		System.out.println("Derived class variable value = "+no2);
	}
}
class DemoOne
{
	public static void main(String args[])
	{
		ChildOne ob = new ChildOne(10,20);
		ob.display();
	}
}