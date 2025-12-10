package Operator;

import java.util.Scanner;

public class Relationaloperator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value For N");
        int N = sc.nextInt();
        System.out.println("Enter The Value For M");
        int m = sc.nextInt();

        System.out.println(N == m);
        System.out.println(N != m);
        System.out.println(N > m);
        System.out.println(N < m);
        System.out.println(N >= m);
        System.out.println(N <= m);

    }
}
