/*Use of Single Inheritance in Java */

import java.util.*;
class Parent11
{
	int no1;
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		no1 = sc.nextInt();
	}
}
class Child11 extends Parent11
{
	int no2,res;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the second value");
		no2 = sc.nextInt();
	}
	void addition()
	{
		res = no1 + no2;
	}
	void show()
	{
		System.out.println("Addition of "+no1+" and "+no2+" is "+res);
	}
}
class DemoSingleInheritance
{
	public static void main(String args[])
	{
		Child11 ob = new Child11();
		ob.get();
		ob.input();
		ob.addition();
		ob.show();
	}
}