import java.util.*;
class smallest{
	public static void main(String []a)
	{
		int a[];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int l=sc.nextInt();
		a[] = new int[l];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the k");
		int k=sc.nextInt();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
			if(i==k-1){
				
				System.out.println("smallest elements is:"+a[i]);
			}
		}
	}
}