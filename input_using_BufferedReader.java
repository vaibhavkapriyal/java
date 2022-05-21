import java.io.*;
class Abc
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("\nEnter your name:- \n");
		String s= br.readLine();
		System.out.println("\n"+s+"\n");
		br.close();
		isr.close();
	}
}
