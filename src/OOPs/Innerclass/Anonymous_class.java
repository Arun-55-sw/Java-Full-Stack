package OOPs.Innerclass;

abstract class abc
{
    abstract void add(int a, int b);
}
public class Anonymous_class {// we can achieve using interface and abstract class both.
    static void main(String[] args) {
        abc obj = new abc()
        {
           void add(int a, int b)
            {
                System.out.println("Anonymous Inner Class");
                System.out.println(a+b);
            }
        };
        obj.add(5,3);

    }

}
