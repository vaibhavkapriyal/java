 import java.util.*;

class Bank
{
	int accno,bal;
	String name;
	
	Scanner sc=new Scanner(System.in);
	
	void insert()
	{
		System.out.println("Enter your details:- ");
		System.out.print("Name         :- ");
		name=sc.nextLine();
		System.out.print("Account no. :- ");
		accno=sc.nextInt();
		System.out.print("Balance    :- ");
		bal=sc.nextInt();
	}
	void withdraw()
	{
		int w;
		if(bal>0)
		{
			System.out.print("Enter the Amount:- ");
			w=sc.nextInt();
			if(w>bal)
				System.out.println("Cannot withdraw the ammount");
			else
			{
				System.out.println("Money withdrawn!!!");
				bal=bal-w;
			}
		}
	}
	void deposit()
	{
		int d;
		System.out.print("Enter the Amount:- ");
		d=sc.nextInt();
		System.out.println("Money deposited successfully!!!");
		bal=bal+d;
	}
	void checkBalance()
	{
		System.out.println("Your Current balance is :-"+bal);
	}
	void display()
	{
		System.out.println("Your details");
		System.out.println();
		System.out.println("Name           :-"+name);
		System.out.println("Account no.    :-"+accno);
		System.out.println("Current Balance:-"+bal);
	}
	
	public static void main(String args[])
	{
		Bank b=new Bank();
		b.insert();
		System.out.println();
		b.display();
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Check Balance");
		System.out.println("4.Exit");
		System.out.println();
		int ch=0;
		while(ch!=4)
		{
			System.out.println();
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					b.withdraw();
					System.out.println();
					break;
				}
				case 2:
				{
					b.deposit();
					System.out.println();
					break;
				}
				case 3:
				{
					b.checkBalance();
					System.out.println();
					break;
				}
			}
		}
		
	}
	
}