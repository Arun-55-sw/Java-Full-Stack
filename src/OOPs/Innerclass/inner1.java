package OOPs.Innerclass;
class outer
{
    private class inner
    {
        public void innermethod()
        {
            System.out.println(" Inner Class ");
        }
    }
    void abc()
    {
        inner obj = new inner();
        obj.innermethod();
    }
}

public class inner1 {
    static void main(String[] args) {
        outer obj1 = new outer();
        obj1.abc();
    }
}
