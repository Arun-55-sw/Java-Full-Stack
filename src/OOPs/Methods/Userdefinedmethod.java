package OOPs.Methods;
class java {
    public void greet()      // Method declaration
    {
        System.out.println(" Hello Every One ");
    }
    public int addition(int a, int b)
    {
        return a+b;

    }
    public int substraction(int p, int q)
    {
        return p-q;
    }
}
public class Userdefinedmethod {
    static void main(String[] args) {
        java obj=new java();  //method call
        obj.greet();

        java obj1=new java();
        int a=obj1.addition(5,3);
        System.out.println(a);

        java obj2=new java();
        int b=obj1.substraction(5,3);
        System.out.println(b);
    }

}
