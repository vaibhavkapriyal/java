class Ab extends Thread
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            System.out.println("For Thread A "+i);
        }
    };
};
class Bc extends Thread
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            System.out.println("For Thread B "+i);
        }
    };
};
class Mythread
{
    public static void main()
    {
        Ab a=new Ab();
        Bc b=new Bc();
        a.start();
        b.start();
    };
};
