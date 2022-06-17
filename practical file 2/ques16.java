import java.io.*;

class Ab
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("/home/sammei/Desktop/sammei/java/practical file 2/read.txt");
		BufferedInputStream bis =new BufferedInputStream(fis);
	
		FileOutputStream fos=new FileOutputStream("/home/sammei/Desktop/sammei/java/practical file 2/write.txt");
		BufferedOutputStream bos =new BufferedOutputStream(fos);
	
		int i=0;
		while((i=bis.read())!=-1)
		{
			bos.write(i);
		}
		System.out.println();
		bos.close();
		fos.close();
		bis.close();
		fis.close();
	}
}