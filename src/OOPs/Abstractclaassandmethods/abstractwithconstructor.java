package OOPs.Abstractclaassandmethods;

abstract class animals {
    String colour;
    int price;

    animals(String colour, int price)
    {
        this.colour = colour;
        this.price = price;
    }

    abstract void details();
}
class dog extends animals
{
    dog(String colour, int price)
    {
        super(colour,price);
    }
    void details()
    {
        System.out.println(colour+" "+price);
    }
}
public class abstractwithconstructor {
    static void main(String[] args) {

        dog obj = new dog("black",40000);
        obj.details();

    }
}
