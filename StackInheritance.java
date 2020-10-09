/* DEFINE A CLASS STACK HAVING DATAMEMBER top AND METHODS PUSH(),POP(),SHOW().WAP TO IMPLEMENT THESE FUNCTIONALITIES */

import java.util.*;
class Stack
{
	
	static int top=-1;
	static int arr[]=new int[50];
	static void push()
	{
		Scanner sc= new Scanner(System.in);
		top++;
		System.out.println("Enter the element to push:  ");
		arr[top]=sc.nextInt();
	}
	static void pop()
	{
		System.out.println("Popped element:  "+arr[top]);
		top--;
	}
	static void display()
	{
		System.out.println("Elements of Stack are");
		for(int j=top;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
	}
}
class StackInheritance extends Stack
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int size,choice;
		System.out.println("Enter the size of stack");
		size=sc.nextInt();
		do
		{
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.DISPLAY");
			System.out.println("0.EXIT");
			System.out.print("Enter your choice:  ");
			choice =sc.nextInt();
		
			if(choice==1)
			{
				if(top==size-1)
				{
					System.out.println("STACK OVERFLOW");
				}
				else
				{
					Stack.push();
				}
			}
			else if(choice==2)
			{
				if(top==-1)
				{
					System.out.println("STACK UNDER FLOW");
				}
				else
				{
					Stack.pop();
				}
			}
			else if(choice ==3)
			{
				if(top==-1)
				{
					System.out.println("STACK UNDER FLOW");
				}
				else
				{
					Stack.display();
				}
			}

		}while(choice!=0);	
	}
}
