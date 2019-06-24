import java.util.*;
class max{
public static void main(String []args)
{
	int []a;
System.out.println("enter the length of array");
int l=new Scanner(System.in).nextInt();
a=new int[l];
System.out.println("enter the elements in array");
for(int i=0;i<a.length;i++)
{
	a[i]=new Scanner(System.in).nextInt();
}
int n=a.length;
if(n<=2)
{
	System.out.println("no triplet exists");
}
else
{
int p=a[0];
int b=a[1];
int c=a[2];
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
	
		for(int k=j+1;k<a.length;k++)
		{
			if(a[i]*a[j]*a[k] > p*b*c)
			{
				p=a[i];
				b=a[j];
				c=a[k];
			}
		}
	}
}
System.out.println(p+" "+b+" "+c+" ");
}
}
}