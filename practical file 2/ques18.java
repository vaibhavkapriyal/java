import java.io.*;

class Ab
{
	public static void main(String args[])throws IOException
	{
		FileReader fr=new FileReader("/home/sammei/Desktop/sammei/java/practical file 2/read.txt");
		BufferedReader br =new BufferedReader(fr);
	
		String s=" ";
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		System.out.println();
		br.close();
		fr.close();
	}
}