/*Use of super keyword to access instance variable and method of immediate base class in Java*/

class One
{
	int no = 10;
	One()
	{
		System.out.println("Default constructor of Base Class");
	}
	void display()
	{
		System.out.println("Base class method");
	}
}
class Two extends One
{
	int no = 20;
	Two()
	{
		System.out.println("Default constructor of Derived class");
	}
	void show()
	{
		System.out.println("Base class variable value = "+super.no);
		System.out.println("Derived class variable value = "+no);
		super.display();
	}
}
class DemoSuper1
{
	public static void main(String args[])
	{
		Two ob = new Two();
		ob.show();
	}
}