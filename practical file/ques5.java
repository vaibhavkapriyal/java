class Student
{
	static int id;
	static String name,branch,univ;
	
	 static void setDetails()
	{
		name="Vaibhav Kumar";
		branch="CSE";
		univ="GEHU";
		id=2018837;
	}
	
	static void showDetails()
	{
		System.out.println("Name       :-"+name);
		System.out.println("Branch     :-"+branch);
		System.out.println("University :-"+univ);
		System.out.println("Student id :-"+id);
	}
	
	public static void main(String args[])
	{
		setDetails();
		showDetails();
	}
}