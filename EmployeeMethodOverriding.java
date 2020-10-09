/*Q1 Employee details using Inheritance*/

import java.util.*;

class Employee
{
		private String empName;
		private int empID;
		
		Employee()
		{
		}
		
		Employee(String name1,int empno1)
		{
			empName=name1;
			empID=empno1;
		}
		
		void input()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Employee name");
			empName=sc.nextLine();
			System.out.println("Enter the EmployeeNumber");
			empID=sc.nextInt();
		}
				
		void display()
		{
			System.out.print(empName+"\t"+empID);
		}
}

class Manager extends Employee
{
	private double basic;
	private byte da,hra;
	double gross;
	
	Manager()
	{
		super();
		basic = 5000;
		da=100;
		hra=50;		
	}
	
	Manager(String name1,int empno1,double basic1,byte da1,byte hra1)
	{
		super(name1,empno1);
		basic=basic1;
		da=da1;
		hra=hra1;
	}
	
	void input()
	{
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary");
		basic=sc.nextDouble();
		System.out.println("Enter the DA(<128)");
		da=sc.nextByte();
		System.out.println("Enter the HRA(<128)");
		hra=sc.nextByte();
	}
	void calSal()	
	{
		gross=basic+da+hra;
	}
	void display()
	{
		super.display();
		System.out.println("\t\t"+basic+"\t"+da+"\t"+hra+"\t"+gross);
	}
}


class EmployeeMethodOverriding
{
	public static void main(String args[])
	{
		//Object creatation
		Manager ob2 = new Manager("Sam",11,7000,(byte)10,(byte)15);	
		ob2.calSal();
			
		//Display
		System.out.println("Details of Employees :");
		ob2.display();
		
		//Object creatation
		Manager ob1 = new Manager();
		ob1.input();
		ob1.calSal();
			
		//Display
		System.out.println("Details of Employees :");
		ob1.display();
		
	}
}

