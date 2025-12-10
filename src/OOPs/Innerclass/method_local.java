package OOPs.Innerclass;

class outer2
{
    void abc()
    {
        class inner2
        {
            void pqr()
            {
                System.out.println("Using Method Local Inner Class");
            }
        }
         inner2 obj2 =new inner2();
        obj2.pqr();
    }

}
public class method_local {
    static void main(String[] args) {
        outer2 obj =new outer2();
        obj.abc();

    }
}
