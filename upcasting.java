class Bank
{
	void getROI()
	{
	System.out.println("2.0");	
	}
	
	public static void main(String args[])
	{
		Bank obj=new Pnb();
		obj.getROI();
		Bank obj1=new Sbi();
		obj1.getROI();
		Bank obj2=new Hdfc();
		obj2.getROI();
		Bank obj3=new Bank();
		obj3.getROI();
	}
}
class Hdfc extends Bank
{
	void getROI()
	{
	System.out.println("4.0");
	}
}
class Sbi extends Bank
{
	void getROI()
	{
	System.out.println("4.5");
	}
}
class Pnb extends Bank
{
	void getROI()
	{
	System.out.println("5");
	}
}
