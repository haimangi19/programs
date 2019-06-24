import java.util.*;
class p1
{
	public static void main(String args[])
	{
	String []a;
	int []b;
	int t;
	String r;
System.out.println("enter the size of array1");
int n=new Scanner(System.in).nextInt();
a=new String[n];
System.out.println("enter the size of array2");
int p=new Scanner(System.in).nextInt();
b=new int[p];
if(n==p)
{
	System.out.println("enter the elements in array 1");
		for(int i=0;i<a.length;i++)
			a[i]=new Scanner(System.in).next();
	System.out.println("Enter the numbers in array 2");
		for(int j=0;j<b.length;j++)
			b[j]=new Scanner(System.in).nextInt();
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<b.length-i-1;j++)
		{
				if(b[j]>b[j+1])
				{
					
					t=b[j];
					b[j]=b[j+1];
					b[j+1]=t;
					
					r=a[j];
					a[j]=a[j+1];
					a[j+1]=r;
				}
		}
	}

for(int i=0;i<a.length;i++)
{
System.out.print(" "+a[i]);
}
}
else
{
	System.out.println("No.of elements are not similar");
}
	}
}
	
		
	