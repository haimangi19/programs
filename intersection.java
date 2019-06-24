import java .util.*;
class intersection
{
	public static void main(String []args){
		
	int b[],t;
		System.out.println("enter the size of array1");
			int n=new Scanner(System.in).nextInt();
			int []a1=new int[n];
			System.out.println("enter the elements in array1");
			for(int i=0;i<a1.length;i++)
				{
					a1[i]=new Scanner(System.in).nextInt();
				}
		System.out.println("enter the size of array2");
			int k=new Scanner(System.in).nextInt();
			int []a2=new int[k];
			System.out.println("enter the elements in array2");
			for(int i=0;i<a2.length;i++)
				{
					a2[i]=new Scanner(System.in).nextInt();
				}
				b=new int[n+k];
				int m=0;
				for(int i=0;i<a1.length;i++)
				{
					for(int j=0;j<a2.length;j++)
					{
						if(a1[i]==a2[j])
						{
							b[m++]=a1[i];
						}
					}
				}
				System.out.print("intersection is");
				for(int i=0;i<m;i++)
				{
					System.out.print(" "+b[i]);
				}
	}
}