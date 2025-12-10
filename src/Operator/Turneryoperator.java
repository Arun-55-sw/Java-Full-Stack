package Operator;

import java.util.Scanner;

public class Turneryoperator {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Value For A : ");
        int p = sc.nextInt();
        System.out.println("Enter The Value For B : ");
        int q = sc.nextInt();
        int r=(p>=q)?p:q;

        System.out.println("The Out Put Will Be :"+r);
    }
}
