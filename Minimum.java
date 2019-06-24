import java.util.*;
class Minimum
{
	public static void main(String []args)
		{
			int min;
			min=0;
		
			System.out.println("enter the size of array");
			int n=new Scanner(System.in).nextInt();
			int []a=new int[n];
			System.out.println("enter the elements in array");
			for(int i=0;i<a.length;i++)
				{
					a[i]=new Scanner(System.in).nextInt();
				}
					min=a[0];
					for(int j=0;j<a.length;j++)
					{
						if(min>a[j])
							 min=a[j];
					}
					
				
				System.out.println("Maximum no. is"+min);
		}
}