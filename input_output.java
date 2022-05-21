import java.io.*;
class Ab
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("/home/gehu/Desktop/t1.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("/home/gehu/Desktop/t.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int i=0;
		while((i=bis.read())!=-1)
		{
			bos.write(i);
		}
		bis.close();
		fis.close();
		bos.close();
		fos.close();
	}
}
