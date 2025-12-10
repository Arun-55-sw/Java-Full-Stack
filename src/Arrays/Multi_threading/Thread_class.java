package Arrays.Multi_threading;

class multi extends Thread // First We Need To Create Class After that Mention "Thread" , that will be "Thread Class".
{
    public void run()// Run Is The Default That's Y We Use In Method.
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(" 'Thread' ");
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }

        }
    }
}
    class multi1 extends Thread
    {
        public void run()
        {
            for (int i = 0; i < 4; i++)
            {
                System.out.println("Using Multiple Threads...! ");
                try
                {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
    }
    public class Thread_class {
        static void main(String[] args) {
            Thread obj = new multi();
            obj.start();
            Thread obj1 = new multi1();
            obj1.start();

        }
    }
