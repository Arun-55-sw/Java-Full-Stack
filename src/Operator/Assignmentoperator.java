package Operator;

import java.util.Scanner;

public class Assignmentoperator {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Value For P");
        int p = sc.nextInt();
        System.out.println("Enter The Value For Q");
        int q = sc.nextInt();

        System.out.println(p+=q);
        System.out.println(p-=q);
        System.out.println(p*=q);
        System.out.println(p/=q);
        System.out.println(p%=q);
        System.out.println(p&=q);
        System.out.println(p&q);
        System.out.println(p | q);
        System.out.println(p^q);
        System.out.println(~q);
        System.out.println(p<<2);
        System.out.println(q>>2);

    }
}
