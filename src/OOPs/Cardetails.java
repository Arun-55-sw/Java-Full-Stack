package OOPs;

class car
{
    String Name = " BMW";
    int price = 30000000;
    String colour = "Black";
    String Model = " M5 Compitation";
    String Rigno="KA 09 JA 1552";

}
class Bike
{
    String Name = " Yamaha ";
    int price = 4500000;
    String colour = "Blue";
    String Model = " R1M ";
    String Rigno="KA 09 JM 2222";
        }
public class Cardetails {
    static void main(String[] args) {
        car obj1 = new car();
        Bike obj2 = new Bike();
        System.out.println("Car Name IS :"+obj1.Name);
        System.out.println("The Price Of The "+obj1.Name+obj1.Model+ " Is :" +obj1.price);
        System.out.println(obj1.Name+obj1.Model+" Is : "+obj1.colour);
        System.out.println("The Model Of "+obj1.Name+" IS :"+obj1.Model);
        System.out.println("The Registration Of The "+obj1.Name+ obj1.Model+" Is :"+obj1.Rigno);

        System.out.println("\n");

        System.out.println(" Bike Name IS :"+obj2.Name);
        System.out.println("The Price Of The " +obj2.Name+obj2.Model+ " Is :" +obj2.price);
        System.out.println(obj2.Name+obj2.Model+" Is : "+obj2.colour);
        System.out.println("The Model Of "+obj2.Name+" IS :"+obj2.Model);
        System.out.println("The Registration Of The "+obj2.Name+ obj1.Model+" Is :"+obj2.Rigno);



    }
}
