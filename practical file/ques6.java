import java.lang.*;

class S
{
	public static void main(String args[])
	{
		String s="Java";
		System.out.println(s.concat(" Welcome"));
		System.out.println(s.charAt(1));
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('a',2));
		System.out.println(s.equals("JAVA"));
		System.out.println(s.equalsIgnoreCase("JAVA"));
		System.out.println(s.lastIndexOf('a'));
	}
}