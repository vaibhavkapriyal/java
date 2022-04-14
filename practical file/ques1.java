class Student
{
	int id;
	String name,branch,univ;
	
	 void setDetails()
	{
		name="Vaibhav Kumar";
		branch="CSE";
		univ="GEHU";
		id=2018837;
	}
	
	void showDetails()
	{
		System.out.println("Name       :-"+name);
		System.out.println("Branch     :-"+branch);
		System.out.println("University :-"+univ);
		System.out.println("Student id :-"+id);
	}
	
	public static void main(String args[])
	{
		Student s=new Student();
		s.setDetails();
		s.showDetails();
	}
}