import java.io.*;
class Abc
{
	public static void main(String args[])throws IOException
	{
		FileReader fis=new FileReader("/home/gehu/Desktop/t1.txt");
		BufferedReader br=new BufferedReader(fis);
		String i="";
		while((i=br.readLine())!=null)
		{
			System.out.println(i);
		}
		fis.close();
		br.close();
	}
}
