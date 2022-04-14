import java.util.*;

class A
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
			
		int a[][]=new int[3][];
		a[0]=new int[3];
		a[1]=new int[4];
		a[2]=new int[2];
		
		int i,j;
		
		System.out.println("\nEnter the elements of the array");
		
		for(i=0;i<3;i++)
		{	
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("\nYour Array :- ");
		
		for(i=0;i<3;i++)
		{	
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
}