import java.util.*;
class sort2d
{
	public static void main(String []args)
		{ 
		int a[][];
		int t;
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
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					for(int l=0;l<r-i-1;l++)
						{
							for(int k=0;k<c-l-1;k++)
								{
									if(a[i][k] > a[i][k+1])
										{
											t=a[i][k];
											a[i][k]=a[i][k+1];
											a[i][k+1]=t;
										}		
									}	
						}
				}
			}
			for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
						{
							System.out.println(a[i][j]);
						}
					}
		}
}