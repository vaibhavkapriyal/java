import java.io.*;

class Ab
{
	public static void main(String args[])throws IOException
	{
		FileReader fr=new FileReader("/home/sammei/Desktop/sammei/java/practical file 2/read.txt");
		BufferedReader br =new BufferedReader(fr);
	
		FileWriter fw=new FileWriter("/home/sammei/Desktop/sammei/java/practical file 2/write.txt");
		BufferedWriter bw =new BufferedWriter(fw);
	
		int i=0;
		while((i=br.read())!=-1)
		{
			bw.write((char)i);
		}
		System.out.println();
		bw.close();
		fw.close();
		br.close();
		fw.close();
	}
}