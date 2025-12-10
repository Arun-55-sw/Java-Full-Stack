package OOPs.Constructore;

class A
{
    A()
    {
        System.out.println(" Hello Every One ");
    }
    A(int a)
    {
        System.out.println(a);
    }
    A(int p, int q)
    {
        System.out.println(p+q);
    }
}

public class Constructorexmpl {
    static void main(String[] args) {

        A obj =new A();
        A obj1 =new A(3);
        A obj2 =new A(5,3);

    }
}
