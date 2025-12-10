package Operator;

import java.util.Scanner;

public class Bitwiseoperator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value For S :");
        int s= sc.nextInt();
        System.out.println("Enter The Value For T :");
        int t = sc.nextInt();

        System.out.println(s&t);
        System.out.println(s | t);
        System.out.println(s^t);
        System.out.println(~s);
        System.out.println(s<<2);
        System.out.println(s>>2);
    }
}
