class Student
{
	int id;
	String name,branch,city,univ;
	
	Student()
	{
		this(20801);
	}
	
	Student(int x)
	{
		this(20801,"Vaibhav");
	}
	
	Student(int x,String a)
	{
		this(20801,"Vaibhav","CSE");
	}
	
	Student(int x,String a,String b)
	{
		this(20801,"Vaibhav","CSE","Dehradun");
	}
	
	Student(int x,String a,String b,String c)
	{
		this(20801,"Vaibhav","CSE","Dehradun","GEHU");
	}
	
	Student(int x,String a,String b,String c,String d)
	{
		System.out.println("Your Details ");
		System.out.println("Name :- "+a);
		System.out.println("Id :- "+x);
		System.out.println("Branch :- "+b);
		System.out.println("City :- "+c);
		System.out.println("University :- "+d);
	}
	
	public static void main(String args[])
	{
		new Student();
	}
}