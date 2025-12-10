package OOPs.Interface;

interface B
{
    default int demoo(int a, int b)
    {
        return (a*b);
    }
    static void demo()
    {
        System.out.println("Static Method");
    }
}
class demo2 implements B{

}
public class interface4 {
    static void main(String[] args) {
        demo2 obj = new demo2();
        B.demo();
        System.out.println(obj.demoo(5,3));
    }
}
