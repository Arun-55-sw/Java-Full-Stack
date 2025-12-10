package OOPs.Methods;

import java.util.Scanner;

class Airthmetic {

    public void addition(int a, int b)
    {
        System.out.println("addition value is "+(a+b));
    }
    public void multiplication(int a, int b)
    {
        System.out.println("multiplication value is "+a*b);
    }
    public void substraction(int a, int b)
    {
        System.out.println("substraction value is "+(a-b));
    }
}
public class Mathoperation {
    static void main(String[] args) {

        Airthmetic obj=new Airthmetic();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for A :");
        int a = sc.nextInt();
        System.out.println("Enter the value for B :");
        int b = sc.nextInt();
        obj.addition(a,b);
        obj.multiplication(a,b);
        obj.substraction(a,b);
    }
}
