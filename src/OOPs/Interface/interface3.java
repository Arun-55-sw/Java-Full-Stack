package OOPs.Interface;

interface A
{
    default int demo (int a, int b)
    {
        return a+b;
    }
}

class demo1 implements A{

}
public class interface3 {
    static void main(String[] args) {
        demo1 obj = new demo1();
        System.out.println(obj.demo(5,3));
        System.out.println(" Default Method ");
    }
}
