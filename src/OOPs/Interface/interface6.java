package OOPs.Interface;
interface grand
{
    void add(int a, int b);
}
interface parent extends grand{
    void multi(int p, int q);
}
class child implements parent
{
    @Override
    public void add(int a, int b)
    {
        System.out.println(" Using Multilevel Inheritance  ");
        System.out.println(a+b);
    }
    public void multi(int a, int b)
    {
        System.out.println(a*b);
    }
}

public class interface6 {
    static void main(String[] args) {
        child obj = new child();
        obj.add(5,5);
        obj.multi(2,3);
    }
}
