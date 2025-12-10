package Arrays.Multi_threading;

class abc implements Runnable
{
    public void run()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println("Hii Arun..");
        }
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class pqr implements Runnable
{
    public void run()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println("How Are You..!");
        }
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class Runnable_Interface {
    static void main(String[] args) {
        abc obj=new abc();
        pqr obj1=new pqr();

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
        t2.start();

    }
}
