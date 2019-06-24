import java.util.*;
class p2{
	public static void main(String []args)
	{ int []a;
	int t;
	System.out.println("enter the size of array");
		int n= new Scanner(System.in).nextInt();
		a=new int[n];
		System.out.println("enter the elements in an array");
		for(int i=0;i<a.length;i++)
			a[i]=new Scanner(System.in).nextInt();
		for(int i=0;i<a.length;i++)
		{
			t=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==a[i])
					t++;
			}
			if(t!=2)
				System.out.println("number is:"+a[i]+ " ");
		}
	}
}
