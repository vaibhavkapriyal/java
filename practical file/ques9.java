import java.util.*;

class A
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m,n;
		System.out.println("\nEnter the Dimensions of the array");
		m=sc.nextInt();
		n=sc.nextInt();
		int a[][]=new int[m][n];
		int i,j,b,c=0;
		System.out.println("\nEnter the elements of the array");
		
		for(i=0;i<m;i++)
		{	
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("\nYour Array :- ");
		
		for(i=0;i<m;i++)
		{	
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("\nEnter the element to search in the array");
		b=sc.nextInt();
		
		for(i=0;i<m;i++)
		{	
			for(j=0;j<n;j++)
			{
				if(b==a[i][j])
				{
					c++;
					break;
				}
			}
		}
		
		if(c!=0)
			System.out.println("\nElement found");
		else
		System.out.println("\nElement not found");
	}
}