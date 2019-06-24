import java.util.*;
class p4
{
	public static void main(String []args)
	{
	int a[];
	System.out.println("Enter the size of array");
	int z = new Scanner(System.in).nextInt();
	a=new int[z];
	System.out.println("enter the elements in array");
	for(int i=0;i<a.length;i++)
		a[i] = new Scanner(System.in).nextInt();
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				
				int p=a[j];
				a[j]=a[j+1];
				a[j+1]=p;
			}
		}
	}
	System.out.println("enter the value of k");
	int k= new Scanner(System.in).nextInt();
	System.out.println(a[k-1]);
	}
}