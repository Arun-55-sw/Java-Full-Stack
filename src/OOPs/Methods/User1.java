package OOPs.Methods;

import java.util.Scanner;

class person
{
    public void details(String name, int age)
    {
        System.out.println(name +" "+age);
    }
}

public class User1 {
    static void main(String[] args) {
        person obj = new person();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Person Details");
        String name = sc.nextLine();
        int age = sc.nextInt();

        obj.details(name,age);
        obj.details("Arun ",22);
    }
}
