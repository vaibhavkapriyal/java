class Append
{  
	public static void main(String args[])
	{  
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");
		System.out.println(sb);
		StringBuffer s=new StringBuffer("Hello "); 
		s.insert(1,"Java"); 
		System.out.println(s);
		StringBuffer s1=new StringBuffer("Hello ");
		s1.replace(1,2,"Java");
		System.out.println(s1);
		StringBuffer s2=new StringBuffer("Hello ");
		s2.delete(1,2);
		System.out.println(s2);
		StringBuffer s3=new StringBuffer("Hello ");
		s3.reverse();  
		System.out.println(s3);   
	}  
}  
