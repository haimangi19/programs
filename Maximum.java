import java.util.*;
class Maximum
{
	public static void main(String []args)
		{
			int max;
			max=0;
		
			System.out.println("enter the size of array");
			int n=new Scanner(System.in).nextInt();
			int []a=new int[n];
			System.out.println("enter the elements in array");
			for(int i=0;i<a.length;i++)
				{
					a[i]=new Scanner(System.in).nextInt();
				}
			//for(int i=0;i<a.length;i++)
				//{
					//max=0;
					max=a[0];
					for(int j=0;j<a.length;j++)
					{
						if(max<a[j])
							 max=a[j];
					}
					
				
				System.out.println("Maximum no. is"+max);
		}
}