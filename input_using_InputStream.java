import java.io.*;
class Ab
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("/home/gehu/Desktop/t1.txt");
		FileOutputStream fos=new FileOutputStream("/home/gehu/Desktop/t.txt");
		int i=0;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		fis.close();
		fos.close();
	}
}
