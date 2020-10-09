/*Use of Multi-level Inheritance in Java */

import java.util.*;
class Parent21
{
	int no1;
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		no1 = sc.nextInt();
	}
}
class Child21 extends Parent21
{
	int no2;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the second value");
		no2 = sc.nextInt();
	}
}
class Child31 extends Child21
{
	int no3,res;
	void get3()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the third value");
		no3 = sc.nextInt();
	}
	void addition()
	{
		res = no1 + no2 + no3;
	}
	void show()
	{
		System.out.println("Addition of "+no1+" and "+no2+" and "+no3+" is "+res);
	}
}
class DemoMultiLevelInheritance
{
	public static void main(String args[])
	{
		Child31 ob = new Child31();
		ob.get();
		ob.input();
		ob.get3();
		ob.addition();
		ob.show();
	}
}