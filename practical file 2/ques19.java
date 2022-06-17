import java.io.*;
class Abc
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		FileOutputStream fos=new FileOutputStream("/home/sammei/Desktop/hii.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		System.out.println("\nEnter your name:- \n");
		String s= br.readLine();
		byte b[]=s.getBytes();
		bos.write(b);
		
		br.close();
		isr.close();
		bos.close();
		fos.close();
	}
}