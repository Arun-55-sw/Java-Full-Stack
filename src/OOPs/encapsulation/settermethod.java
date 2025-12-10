package OOPs.encapsulation;

class encap
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name1)
    {
        name =name1;
    }
    public void setAge(int age1)
    {
        age=age1;
    }

}

public class settermethod {
    static void main(String[] args) {

        encap obj = new encap();
        obj.setName("kumar");
        obj.setAge(22);
        System.out.println(obj.getName()+" "+obj.getAge());

    }
}
