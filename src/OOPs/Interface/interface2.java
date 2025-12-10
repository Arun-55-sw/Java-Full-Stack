package OOPs.Interface;

interface s
{
    int a=5;
    static int b=10;
    final int c=15;
}
class t implements s{

}
public class interface2 {
    static void main(String[] args) {
        t obj =new t();
        System.out.println("Using static and final method ");
        System.out.println(s.a);
        System.out.println(s.b);
        System.out.println(obj.c);
    }
}
