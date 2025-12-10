package Operator;

import java.util.Scanner;

public class Logicaloperator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value For N");
         int N= sc.nextInt();
        System.out.println("Enter The Value For M");
        int M = sc.nextInt();

        System.out.println(N>M && N==0);
        System.out.println(N<=2 || N>M);
        System.out.println(!(N<=2  || N>M));


    }
}
