package OOPs;

class Dog {
    String name = "Maxy";
    int age = 3;
    String colour = "Brown";

        }
public class oops1 {
    static void main(String[] args) {
        String name = "Tiger";
        int age1 = 5;
        Dog obj = new Dog();
        System.out.println("Dogs name are : "+name+ " And " +obj.name);
        System.out.println(obj.name+ " Age is: "+obj.age);
        System.out.println(name+ " Age is: "+age1);
        System.out.println(obj.name+ " Colour is : "+obj.colour);
    }
}
