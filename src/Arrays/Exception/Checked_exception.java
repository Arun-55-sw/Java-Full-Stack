package Arrays.Exception;

public class Checked_exception {
    static void main(String[] args) {
                 // Airthmatic Exception
        /*
        int a=5;
        int b=0; // this is in critical statement that's y we use try-catch block
        try {

            int c = a / b;
            System.out.println(c);
        }
        catch (Exception e) // here "e" is the variable name you can take whatever variable u want
        {
            System.out.println(e);
        }

         */
      //ArrayIndexOutOfBoundsException
      /* int[] a={1,2,4,7};
        try
        {
            System.out.println(a[5]);
        } catch (Exception e)
        {
            System.out.println(e);
        }
        */

       // NullPointerException
        int[] a={1,2,5,4};
        try {
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("This Is Mandatory");
        }
    }
}
