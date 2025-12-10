package OOPs.Abstractclaassandmethods;

abstract class demo {

   // abstract void person(String name, int age);// this is for methode
}
    class ab extends demo
    {
        void person(String name,int age)// this is for method
        {
            System.out.println(name+" "+ age);
        }
    }

public class Abstract {
    static void main(String[] args) {

        ab obj = new ab();
        obj.person("Arun",22);


    }
}
