package OOPs.encapsulation;

class encps
{
    private String name="Arun";
    private int age = 22;

    public String getName()
    {
        return name;

    }
    public int getAge()
    {
        return age;
    }
}
public class gettermethod {
    static void main(String[] args) {

        encps obj = new encps();
        System.out.println(obj.getName()+" "+obj.getAge());

    }
}
