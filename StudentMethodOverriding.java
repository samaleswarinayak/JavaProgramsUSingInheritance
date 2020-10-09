/* Result of stdudent using Inheritance*/

import java.util.*;

class Student
{
	private String name;
	private int roll;
	
	Student()
	{
	}
	Student(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	void print()
	{
		System.out.println("Student Name : "+name);
		System.out.println("Student Roll: "+roll);
	}
}

class Test extends Student
{
	private int mark1,mark2,mark3;
	
	Test()
	{
	}
	Test(String name11,int roll11,int mark11,int mark22,int mark33)
	{
		super(name11,roll11);
		mark1=mark11;
		mark2=mark22;
		mark3=mark33;
	}
	void print()
	{
		super.print();
		System.out.println("Student Marks : ");
		System.out.println(mark1+"\n"+mark2+"\n"+mark3+"\n");
	}
}

class Result extends Test
{
	private int total;
	
	Result()
	{
	}
	
	Result(String name11,int roll11,int mark11,int mark22,int mark33)
	{
		super(name11,roll11,mark11,mark22,mark33);
		total=mark11+mark22+mark33;
	}
	void print()
	{
		super.print();
		System.out.println("Student Total: "+total);
	}
}

class StudentMethodOverriding
{
    public static void main(String[] args)
	{
		Result ob =new Result("Shree",31,33,44,66);
		ob.print();
	}
}
