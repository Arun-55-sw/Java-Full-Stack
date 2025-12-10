package OOPs.Innerclass;

class outer1
{
    private String name="Arun";
    private int age = 22;
    public class inner1
    {
        public String getName()
        {
            return name;
        }
        int getValue()
        {
            System.out.println("Inner Class USing Variable");
            return age;
        }
    }
}
public class inner2 {
    static void main(String[] args) {
        outer1 obj = new outer1();
        outer1.inner1 obj2=obj.new inner1();
        System.out.println(obj2.getName() + " "+obj2.getValue());

    }
}
