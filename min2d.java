import java.util.*;
class min2d
{
	public static void main(String []args)
		{
			int min;
			min=0;
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
					min=a[0][0];
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							if(min>a[i][j])
								min=a[i][j];
						}
					}
					
				
				System.out.println("Minimum no. is "+min);
		}
}