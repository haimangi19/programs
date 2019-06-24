import java.util.*;
class sort1d
{
	public static void main(String []args)
	{	Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n= s.nextInt();
		System.out.println("enter the elements in array");
		int []a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.print("Sorted array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}
				