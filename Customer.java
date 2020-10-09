/* 1.	DEFINE A CLASS CUSTOMER AND DEFINE DATA THE DATA MEMBER NAME,ADDRESS AND AGE AND THEN CREATE A ANOTHER CLASS SavingS HAVING DATA MEMBERS ACCOUNT NUMBER AND BALANCE THAT INHERITS CLASS CUSTOMER
HAVING TWO METHODS INPUT() AND SHOW() SIMILARY CREATE ANOTHER CLASS Loan WITH DATA MEMBERS ACCOUNT NUMBER,TOTAL INSTALLMENTS, INSTALLMENT AMOUNT THAT INHERITS CLASS CUSTOMER HAVING TWO METHODS INPUT() AND SHOW() AND THEN CREATE ANOTHER CLASS Current WITH DATA MEMBERS ACCOUNT NUMBER, LIMIT AND BALANCE HAVING TWO METHODS INPUT() AND SHOW() THAT INHERITS CUSTOMER
 */
 
import java.util.Scanner;
class Customer
{
	Scanner sc= new Scanner(System.in);
	String name,address;
	int age;
	public static void main(String[] args) 
	{
		Saving ob=new Saving();
		Loan ob1=new Loan();
		Current ob2=new Current();
		ob.input();
		ob.show();
		System.out.println("============================");
		ob1.input();
		ob1.show();
		System.out.println("============================");
		ob2.input();
		ob2.show();
		System.out.println("=============================");
	}
}
class Saving extends Customer
{
	
	int acc,balance;

	void input()
	{
		System.out.println("enter name: ");
		name=sc.nextLine();
		System.out.println("enter address: ");
		address=sc.nextLine();
		System.out.println("enter age:  ");
		age=sc.nextInt();
		System.out.println("enter account number: ");
		acc=sc.nextInt();
		System.out.println("enter balance: ");
		balance=sc.nextInt();

	}
	void show()
	{
		System.out.println("name: "+name);
		System.out.println("address: "+address);
		System.out.println("age: "+age);
		System.out.println("account number: "+acc);
		System.out.println("balance: "+balance);
	}
}
class Loan extends Customer
{
	int acc,install,toinstall;
	void input()
	{
		System.out.println("enter name: ");
		name=sc.nextLine();
		System.out.println("enter address: ");
		address=sc.nextLine();
		System.out.println("enter age:  ");
		age=sc.nextInt();
		System.out.println("enter account number: ");
		acc=sc.nextInt();
		System.out.println("enter total installment amount: ");
		install=sc.nextInt();
		System.out.println("enter total installments");
		toinstall=sc.nextInt();

	}
	void show()
	{
		System.out.println("name: "+name);
		System.out.println("address: "+address);
		System.out.println("age: "+age);
		System.out.println("account number: "+acc);
		System.out.println("installment amount: "+install);
		System.out.println("total installment: "+toinstall);
	}
}
class Current extends Customer
{
	int acc,balance,limit;
	
	void input()
	{
		System.out.println("enter name: ");
		name=sc.nextLine();
		System.out.println("enter address: ");
		address=sc.nextLine();
		System.out.println("enter age:  ");
		age=sc.nextInt();
		System.out.println("enter account number: ");
		acc=sc.nextInt();
		System.out.println("enter balance: ");
		balance=sc.nextInt();
		System.out.println("enter limit: ");
		limit=sc.nextInt();
	}
	void show()
	{
		System.out.println("name: "+name);
		System.out.println("address: "+address);
		System.out.println("age: "+age);
		System.out.println("account number: "+acc);
		System.out.println("balance: "+balance);
		System.out.println("enter limit: "+limit);
	}
}

