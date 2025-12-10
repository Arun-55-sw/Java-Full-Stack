package ConditionStatements;

import java.util.Scanner;

public class Nestedifelsestatement {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Valur For A : ");
        int a = sc.nextInt();
        System.out.println("Enter The Value For B : ");
        int b = sc.nextInt();
        System.out.println("Enter The Value For C : ");
        int c = sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" Is Larger : ");
            }
            else {
                System.out.println(b+" Is Larger : ");
            }

            if(b>c)
            {
                System.out.println(b+" Is Larger : ");
            }
            else
            {
                System.out.println(c+" SIs Larger: ");
            }
        }
    }
}
