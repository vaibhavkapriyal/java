class Shape
{
	int area(int x,int y)
	{
		int area=x*y;
		return area;
	}
	
	int area(int x)
	{
		int area=x*x;
		return area;
	}
	
	int area(float x)
	{
		int area=(int)(3.14*x*x);
		return area;
	}
	
	int area(float x,float y)
	{
		int area=(int)(0.5*x*y);
		return area;
	}
	
	public static void main(String args[])
	{
		Shape s=new Shape();
		int a=s.area(4,5);
		System.out.println("\nArea of Rectangle :-"+a);
		int b=s.area(4);
		System.out.println("\nArea of Square :-"+b);
		int c=s.area(4.5f);
		System.out.println("\nArea of circle :-"+c);
		int d=s.area(4.5f,5.5f);
		System.out.println("\nArea of Triangle :-"+d);
	}
}