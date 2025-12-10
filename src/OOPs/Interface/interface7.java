package OOPs.Interface;

interface birds
{
    void bird(String colour, int age);
}
interface bird1 extends birds
{
    void parrot (String colour);
}
interface bird2 extends birds
{
    void falcon(String colour);
}
class Bird implements birds, bird1, bird2
{
    @Override
    public void bird(String colour, int age)
    {
        System.out.println(" hierarchical inheritance ");
       System.out.println("Bird colour : "+colour +" , " + " Bird Age : "+age);
    }

    @Override
    public void falcon(String colour)
    {
        System.out.println("Falcon Colour is : "+colour);

    }

    @Override
    public void parrot(String colour)
    {
        System.out.println("Parrot Colour Is : "+colour);

    }
}
public class interface7 {
    static void main(String[] args) {

        Bird obj = new Bird();
        obj.bird("Green",5);
        obj.parrot("Red");
        obj.falcon("Blue");

}
}