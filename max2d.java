import java.util.*;
class max2d
{
	public static void main(String []args)
		{
			int max;
			max=0;
			int [][]a;
			System.out.println("enter the rowsize of array");
			int r=new Scanner(System.in).nextInt();
			System.out.println("enter the columnsize of array");
			int c=new Scanner(System.in).nextInt();
			a=new int[r][c];
			System.out.println("enter the elements in array");
			for(int i=0;i<r;i++)
				{
					for(int j=0;j<c;j++)
					{
						a[i][j]=new Scanner(System.in).nextInt();
					}
				}
					max=a[0][0];
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							if(max<a[i][j])
								max=a[i][j];
						}
					}
					
				
				System.out.println("Maximum no. is"+max);
		}
}