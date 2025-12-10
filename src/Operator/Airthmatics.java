package Operator;

import java.util.Scanner;

public class Airthmatics {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter the Value For s: ");
        int s= sc.nextInt();
        System.out.println("Enter the Value For m: ");
        int m =sc.nextInt();

         System.out.println(s+m);
        System.out.println(s-m);
        System.out.println(s*m);
        System.out.println(s/m);
        System.out.println(s%m);
        System.out.println(s++);
        System.out.println(s--);
        System.out.println(m++);
        System.out.println(m--);


    }
}
