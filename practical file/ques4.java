import java.util.*;

class Employee
{
	int id, sal;
	String name,d;
	
	Scanner sc = new Scanner(System.in);
	
	Employee()
	{
		this.id=0;
		this.sal=0;
		this.name="";
		this.d="";
	}
	
	void setDetails()
	{
		System.out.println("Enter your Details");
		System.out.print("Name :- ");
		name=sc.nextLine();
		System.out.print("Department :- ");
		d=sc.nextLine();
		System.out.print("Id :- ");
		id=sc.nextInt();
		System.out.print("Salary :- ");
		sal=sc.nextInt();
	}
	void showDetails()
	{
		System.out.println("\nYour Details");
		System.out.println("Name :- "+name);
		System.out.println("Id :- "+id);
		System.out.println("Department :- "+d);
		System.out.println("Salary :- "+sal);
	}
	
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.setDetails();
		e.showDetails();
	}
	
}