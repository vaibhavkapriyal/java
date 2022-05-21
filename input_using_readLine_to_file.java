import java.io.*;
class Abc
{
	public static void main(String args[])throws IOException
	{
		FileReader fis=new FileReader("/home/gehu/Desktop/t1.txt");
		BufferedReader br=new BufferedReader(fis);
		FileWriter fw=new FileWriter("/home/gehu/Desktop/t.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		String i="";
		while((i=br.readLine())!=null)
		{
			bw.write(i);
		}
		fis.close();
		br.close();
		fw.close();
		bw.close();
	}
}
