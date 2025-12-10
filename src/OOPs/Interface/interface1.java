package OOPs.Interface;
interface p
{
    void greet();
}

class q implements p
{
    @Override
    public void greet() {
        System.out.println(" Interface in java ");
    }
}
public class interface1 {
    static void main(String[] args) {

        q obj = new q();
        obj.greet();
    }
}
