package OOPs.Innerclass;

class outer3
{
    static class inner3
    {
        void abc()
        {
            System.out.println("Using Static Nested Class");
        }
    }
}
public class Static_nested {
    static void main(String[] args) {
        outer3.inner3 obj = new outer3.inner3(); // This object creation is different than the method local class
        obj.abc();
    }
}
