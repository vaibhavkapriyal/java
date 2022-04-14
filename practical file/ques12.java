class Bank
{
	void getROI()
	{
	System.out.println("\nInterest Rate of Bank :- 2.0");	
	}
	
	public static void main(String args[])
	{
		Bank obj=new Bank();
		obj.getROI();
		obj=new Hdfc();
		obj.getROI();
		obj=new Sbi();
		obj.getROI();
		obj=new Pnb();
		obj.getROI();
	}
}
class Hdfc extends Bank
{
	void getROI()
	{
	System.out.println("\nInterest Rate of HDFC :- 4.0");
	}
}
class Sbi extends Bank
{
	void getROI()
	{
	System.out.println("\nInterest Rate of SBI :- 4.5");
	}
}
class Pnb extends Bank
{
	void getROI()
	{
	System.out.println("\nInterest Rate of PNB :- 5");
	}
}